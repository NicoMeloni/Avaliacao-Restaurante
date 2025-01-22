package servicos;

import java.util.ArrayList;
import modelos.Usuario;
import permanencia.sqlite.UsuarioDAOLite;

public class ServicoUsuario {
    private static Usuario sessaoUsuario;

    public static Usuario getSessaoUsuario() {
        return sessaoUsuario;
    }

    public static void setSessaoUsuario(Usuario usuarioSessao) {
        ServicoUsuario.sessaoUsuario = usuarioSessao;
    }
    
    public static ArrayList<Usuario> buscaTodos(){
        UsuarioDAOLite acesso =  new UsuarioDAOLite();
        return acesso.buscarTodos();
    }
    
    public static Usuario buscarPorId(int id){
        UsuarioDAOLite acesso =  new UsuarioDAOLite();
        return acesso.buscarPorId(id);
    }
}
