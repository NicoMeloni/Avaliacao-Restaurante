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
}
