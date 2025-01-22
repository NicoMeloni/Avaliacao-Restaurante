package servicos;

import java.util.ArrayList;
import modelos.Avaliacao;
import permanencia.sqlite.AvaliacaoDAOLite;

public class ServicoAvaliacao {
    public static int criaAvaliacao(int idUsuario, int idRestaurante,String conteudo, float nota){
        Avaliacao avaliacao = new Avaliacao(idRestaurante, idUsuario, nota, conteudo);
        AvaliacaoDAOLite acesso = new AvaliacaoDAOLite();
        int resposta = acesso.criar(avaliacao);
        return resposta;
    }
    
    public static ArrayList<Avaliacao> buscaTodos(){
        AvaliacaoDAOLite acesso =  new AvaliacaoDAOLite();
        return acesso.buscarTodos();
    }
    
    public static Avaliacao buscarPorId(int id){
        AvaliacaoDAOLite acesso =  new AvaliacaoDAOLite();
        return acesso.buscarPorId(id);
    }
}
