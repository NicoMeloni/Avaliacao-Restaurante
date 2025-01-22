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


public class Main {

    public static void main(String[] args) {
        ServicoUsuario.setSessaoUsuario(new Usuario("joao", "6969", "huebr@gmail.com"));
        TelaPrincipal main = new TelaPrincipal();
        main.setVisible(true);
    }
}
