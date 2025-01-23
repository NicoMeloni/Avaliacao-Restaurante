package servicos;

import java.util.ArrayList;
import modelos.Avaliacao;
import modelos.Prato;
import permanencia.sqlite.RestauranteDAOLite;
import modelos.Restaurante;

public class ServicoRestaurante {
    public static ArrayList<Restaurante> buscaTodos(){
        RestauranteDAOLite acesso =  new RestauranteDAOLite();
        return acesso.buscarTodos();
    }
    
    public static ArrayList<String[]>buscaResumo(){
        RestauranteDAOLite acesso =  new RestauranteDAOLite();
        return acesso.buscarResumo();
    }
    
    public static Restaurante buscarPorId(int idRestaurante){
        RestauranteDAOLite acesso =  new RestauranteDAOLite();
        return acesso.buscarPorId(idRestaurante);
    }

    public static String buscarNomeRestaurante(int idRestaurante){
        RestauranteDAOLite acesso =  new RestauranteDAOLite();
        return acesso.buscarPorId(idRestaurante).getNome();
    }
    public static ArrayList<Prato>buscarPratos(int idRestaurante){
        RestauranteDAOLite acesso =  new RestauranteDAOLite();
        return acesso.buscarPratos(idRestaurante);
    }
    
    public static ArrayList<Avaliacao> buscarAvaliacoes(int idRestaurante){
        RestauranteDAOLite acesso =  new RestauranteDAOLite();
        return acesso.buscarAvaliacoes(idRestaurante);
    }
    
}
