package main;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Avaliacao;
import modelos.Usuario;
import permanencia.sqlite.AvaliacaoDAOLite;
import servicos.ServicoUsuario;
import telas.TelaPrincipal;
import java.sql.ResultSet;
import permanencia.sqlite.RestauranteDAOLite;
import permanencia.sqlite.UsuarioDAOLite;
import servicos.ServicoAvaliacao;
import telas.TelaCriarConta;


public class Main {

    public static void main(String[] args) {
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        /*AvaliacaoDAOLite acesso = new AvaliacaoDAOLite();
        Avaliacao aval = acesso.buscarPorId(3);
        System.out.println(aval);
        aval.setNota((float) 10);
        System.out.println(aval);
        boolean resposta  = acesso.atualizar(aval, 3);
        System.out.println(resposta);
        Avaliacao naval = acesso.buscarPorId(3);
        System.out.println(naval);*/
    }
}
