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

    public static void setUsuarioAtual(Usuario usuarioSessao) {
        ServicoUsuario.usuarioAtual = usuarioSessao;
    }
    
    public static ArrayList<Usuario> getListaUsuarios(){
        UsuarioDAOLite conexao = new UsuarioDAOLite();
        return conexao.buscarTodos();
    }
    
    public static ArrayList<Avaliacao> buscarAvaliacoes(int idUsuario){
        UsuarioDAOLite conexao = new UsuarioDAOLite();
        return conexao.buscarAvaliacoes(idUsuario);
    }
    
    
    
}
