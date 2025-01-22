package servicos;

import modelos.Usuario;

public class ServicoUsuario {
    private static Usuario sessaoUsuario;

    public static Usuario getSessaoUsuario() {
        return sessaoUsuario;
    }

    public static void setSessaoUsuario(Usuario usuarioSessao) {
        ServicoUsuario.sessaoUsuario = usuarioSessao;
    }
    
    
}
