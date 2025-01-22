/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliaacaorestaurante;

/**
 *
 * @author Nicopau
 */


public class Avaliacao{
   private int idAvaliacao, idRestaurante, idUsuario;
   private float nota;
   private String conteudo;
   private Usuario usuario;
   private Restaurante restaurante;

    public Avaliacao(Usuario usuario, float nota, String conteudo, Restaurante restaurante) {
        this.usuario = usuario;
        this.nota = nota;
        this.conteudo = conteudo;
        this.restaurante = restaurante;
    }

    public Avaliacao(int idAvaliacao, int idRestaurante, int idUsuario, float nota, String dataAvaliacao, String conteudo) {
        this.idAvaliacao = idAvaliacao;
        this.idRestaurante = idRestaurante;
        this.idUsuario = idUsuario;
        this.nota = nota;
        this.conteudo = conteudo;
    }

    public int getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
    
    
}
