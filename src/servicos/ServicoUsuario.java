package servicos;

import java.util.ArrayList;
import modelos.Avaliacao;
import modelos.Usuario;
import permanencia.sqlite.UsuarioDAOLite;

public class ServicoUsuario {
  
    private static Usuario usuarioAtual;

    public static int criar(Usuario usuario){
        UsuarioDAOLite conexao = new UsuarioDAOLite();
        return conexao.criar(usuario);
    }
    
    public static Usuario getUsuarioAtual() {
        return usuarioAtual;
    }
    
    public static ArrayList<Usuario> buscaTodos(){
        UsuarioDAOLite acesso =  new UsuarioDAOLite();
        return acesso.buscarTodos();
    }

    public static Usuario buscarPorId(int id){
        UsuarioDAOLite acesso =  new UsuarioDAOLite();
        return acesso.buscarPorId(id);
    }

    public static ArrayList<Avaliacao> buscarAvaliacoes(int idUsuario){
        UsuarioDAOLite conexao = new UsuarioDAOLite();
        return conexao.buscarAvaliacoes(idUsuario);
    }
}
