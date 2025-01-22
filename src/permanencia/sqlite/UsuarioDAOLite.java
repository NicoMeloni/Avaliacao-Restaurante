package permanencia.sqlite;

import permanencia.interfaces.UsuarioDAO;
import modelos.Avaliacao;
import bancodedados.BancoDeDados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import modelos.Restaurante;
import modelos.Usuario;


public class UsuarioDAOLite implements UsuarioDAO{
    Connection conexao;
    public UsuarioDAOLite() {
        conexao = BancoDeDados.getInstance().getConnection();
    }
    
    @Override
    public boolean apagar(int idUsuario){
        try (PreparedStatement comando = conexao.prepareStatement(
                    "DELETE FROM usuario WHERE idUsuario = ?;")) {
            comando.setInt(1, idUsuario);
            int res  = comando.executeUpdate();
            return res == 1;
        }catch (SQLException ex) {
                System.out.println(ex);
        }
        return false;
    }
    
    @Override
    public Usuario buscarPorId(int idUsuario){
        String nome, senha, email;
        String dataCadastro;
        try (PreparedStatement comando = conexao.prepareStatement(
                "select * from usuario where idUsuario = ?")) {
        comando.setInt(1, idUsuario);
        ResultSet res  = comando.executeQuery();
        if (res.next()){
            nome = res.getString("nome");
            senha = res.getString("senha");
            email = res.getString("email");
            dataCadastro = res.getString("dataCadastro");
            return new Usuario(nome, senha, email, idUsuario, dataCadastro);
        }
        } 
        catch (SQLException ex) {
            System.out.println(ex);
        } 
        return null;
    }
    
    @Override
    public Usuario buscarPorNome(String nomeUsuario){
        String nome, senha, email, dataCadastro;
        int idUsuario;
        try (PreparedStatement comando = conexao.prepareStatement(
                "select * from usuario where nome = ?")) {
        comando.setString(1, nomeUsuario);
        ResultSet res  = comando.executeQuery();
        if (res.next()){
            nome = res.getString("nome");
            senha = res.getString("senha");
            email = res.getString("email");
            dataCadastro = res.getString("dataCadastro");
            idUsuario = res.getInt("idUsuario");
            return new Usuario(nome, senha, email, idUsuario, dataCadastro);
        }
        } 
        catch (SQLException ex) {
            System.out.println(ex);
        } 
        return null;
    }
    
    @Override
    public int criar(Usuario usuario) {
        int resultado = 0;
        if (buscarPorNome(usuario.getNomeUsuario()) != null){
            return resultado;
        }
        try (PreparedStatement comando = conexao.prepareStatement(
                "INSERT INTO usuario(nome, senha, email) VALUES(?, ?, ?)"
                        + "RETURNING idUsuario;")) {
            comando.setString(1, usuario.getNomeUsuario());
            comando.setString(2, usuario.getSenha());
            comando.setString(3, usuario.getEmail());
            ResultSet id = comando.executeQuery();
            resultado = id.getInt("idUsuario");
        } 
        catch (SQLException ex) {
            System.out.println(ex);
        }
        return resultado;
    }
    
    @Override
    public Usuario criarRet(Usuario usuario) {
        String nome, senha, email, dataCadastro;
        int idUsuario;
        if (buscarPorNome(usuario.getEmail()) != null){
            return null;
        }
        try (PreparedStatement comando = conexao.prepareStatement(
                "INSERT INTO usuario(nome, senha, email) "
                + "VALUES(?, ?, ?) RETURNING *;")) {
            comando.setString(1, usuario.getNomeUsuario());
            comando.setString(2, usuario.getSenha());
            comando.setString(3, usuario.getEmail());
            ResultSet ret = comando.executeQuery();
            if (ret.next()){
            nome = ret.getString("nome");
            senha = ret.getString("senha");
            email = ret.getString("email");
            dataCadastro = ret.getString("dataCadastro");
            idUsuario = ret.getInt("idUsuario");
            return new Usuario(nome, senha, email, idUsuario, dataCadastro);
            }
            
        } 
        catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    @Override
    public boolean atualizar(Usuario usuario, int idUsuario){
        try(PreparedStatement restricao = conexao.prepareStatement(
                "SELECT * FROM usuario WHERE idUsuario != ? AND email = ?")) {
            restricao.setInt(1, idUsuario);
            restricao.setString(2, usuario.getEmail());
            ResultSet resultado = restricao.executeQuery();
            if (resultado.next()){
                return false;
            }
        try (PreparedStatement comando = conexao.prepareStatement(
  """
              UPDATE usuario
              SET nome = ?, senha = ?, email = ?,
              WHERE idUsuario = ?; 
        """)) {
            comando.setString(1, usuario.getNomeUsuario());
            comando.setString(2, usuario.getSenha());
            comando.setString(3, usuario.getEmail());
            comando.setInt(4, idUsuario);
            int res  = comando.executeUpdate();
            return res == 1;
        }}
        catch (SQLException ex) {
                System.out.println(ex);
        }
        return false;
    }
    
    @Override
    public ArrayList<Usuario> buscarTodos(){
        String nome, senha, email, dataCadastro;
        int idUsuario;
        ArrayList<Usuario> lista = new ArrayList<>();
        try (PreparedStatement comando = conexao.prepareStatement(
                "select * from usuario")) {
        ResultSet res  = comando.executeQuery();
        while (res.next()){
            nome = res.getString("nome");
            senha = res.getString("senha");
            email = res.getString("email");
            idUsuario = res.getInt("idUsuario");
            dataCadastro = res.getString("dataCadastro");
            lista.add(new Usuario(nome, senha, email, idUsuario, dataCadastro));
            
        }
        }
        catch (SQLException ex) {
            System.out.println(ex);
        } 
        return lista;
    }
    
    @Override
    public ArrayList<Restaurante> buscarRestaurantes(int idUsuario){
        String nome, descricao, localizacao;
        boolean temEntrega;
        int idRestaurante;
        ArrayList<Restaurante> lista = new ArrayList<>();
        
        try (PreparedStatement comando = conexao.prepareStatement(
                "SELECT * FROM restaurante WHERE idUsuario = ?")) {
        comando.setInt(1, idUsuario);
        ResultSet res  = comando.executeQuery();
        while (res.next()){
            nome = res.getString("nome");
            descricao = res.getString("descricao");
            localizacao = res.getString("localizacao");
            temEntrega = res.getInt("temEntrega") == 1;
            idRestaurante = res.getInt("idRestaurante");
            lista.add(new Restaurante(idRestaurante,idUsuario, nome, descricao, localizacao, temEntrega));
        }
        }
        catch (SQLException ex) {
            System.out.println(ex);
        } 
        return lista;
    }

    @Override
    public ArrayList<Avaliacao> buscarAvaliacoes(int idUsuario) {
        int idAvaliacao, idRestaurante;
        float nota;
        String dataAvaliacao, conteudo;
        
        ArrayList<Avaliacao> lista = new ArrayList<>();
        
        try (PreparedStatement comando = conexao.prepareStatement(
                "SELECT * FROM avaliacao WHERE idUsuario = ?")) {
        comando.setInt(1, idUsuario);
        ResultSet res  = comando.executeQuery();
        while (res.next()){
            idAvaliacao = res.getInt("idAvaliacao");
            idRestaurante = res.getInt("idRestaurante");
            nota = res.getFloat("nota");
            dataAvaliacao = res.getString("dataAvaliacao");
            conteudo = res.getString("conteudo");
            lista.add(new Avaliacao(idAvaliacao, idRestaurante, idUsuario, nota, dataAvaliacao, conteudo));
        }
        }
        catch (SQLException ex) {
            System.out.println(ex);
        } 
        return lista;
    }
    
    
}
