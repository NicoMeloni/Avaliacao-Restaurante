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


public class Main {

    public static void main(String[] args) {
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }
}
