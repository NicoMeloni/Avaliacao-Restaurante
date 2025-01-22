package servicos;

import java.util.ArrayList;
import modelos.Prato;
import permanencia.sqlite.PratoDAOLite;

public class ServicoPrato {
        public static ArrayList<Prato> buscaTodos(){
        PratoDAOLite acesso =  new PratoDAOLite();
        return acesso.buscarTodos();
    }
    
    public static Prato buscarPorId(int id){
        PratoDAOLite acesso =  new PratoDAOLite();
        return acesso.buscarPorId(id);
    }
}
