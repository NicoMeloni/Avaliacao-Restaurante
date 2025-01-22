package servicos;

import java.util.ArrayList;
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
    
    public static Restaurante buscarPorId(int id){
        RestauranteDAOLite acesso =  new RestauranteDAOLite();
        return acesso.buscarPorId(id);
    }
}
