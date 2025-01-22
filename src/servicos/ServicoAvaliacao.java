package servicos;

import modelos.Avaliacao;
import permanencia.sqlite.AvaliacaoDAOLite;

public class ServicoAvaliacao {
    public static int criaAvaliacao(int idUsuario, int idRestaurante,String conteudo, float nota){
        Avaliacao avaliacao = new Avaliacao(idRestaurante, idUsuario, nota, conteudo);
        AvaliacaoDAOLite acesso = new AvaliacaoDAOLite();
        int resposta = acesso.criar(avaliacao);
        return resposta;
    }
    public static Avaliacao buscarPorId(int idAvaliacao){
        AvaliacaoDAOLite acesso = new AvaliacaoDAOLite();
        return acesso.buscarPorId(idAvaliacao);        
    }
    public static boolean apagar(int idAvaliacao){
        AvaliacaoDAOLite acesso = new AvaliacaoDAOLite();
        return acesso.apagar(idAvaliacao);
    }
    public static boolean atualizar(Avaliacao avaliacao, int idAvaliacao){
        AvaliacaoDAOLite acesso = new AvaliacaoDAOLite();
        return acesso.atualizar(avaliacao, idAvaliacao);
    }
}
