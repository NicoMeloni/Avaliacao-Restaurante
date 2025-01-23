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
import modelos.Restaurante;
import permanencia.sqlite.RestauranteDAOLite;
import permanencia.sqlite.UsuarioDAOLite;
import servicos.ServicoAvaliacao;
import servicos.ServicoRestaurante;
import telas.TelaCriarConta;
import telas.TelaVisualizarAvaliacoes;
import telas.TelaVisualizarMenu;


public class Main {

    public static void main(String[] args) {
        /*Restaurante res = ServicoRestaurante.buscarPorId(1);
        TelaVisualizarAvaliacoes tela = new TelaVisualizarAvaliacoes(res);
        tela.setVisible(true);*/
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }
}
