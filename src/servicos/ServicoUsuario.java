package servicos;

import java.util.ArrayList;
import modelos.Usuario;
import permanencia.sqlite.UsuarioDAOLite;

public class ServicoUsuario {
    public static Usuario usuarioAtual;

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
    
    
    
    
}
