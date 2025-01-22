/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliaacaorestaurante;

import java.util.ArrayList;


public class Usuario {
    protected String usuario, senha, dataCadastro;
    protected int idUsuario;
    private ArrayList<Avaliacao> listaAvaliacoes = new ArrayList<>();
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    
    
    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        this.listaUsuarios.add(this);
    }
    
    public Usuario(String usuario, String senha, int idUsuario, String dataCadastro) {
        this.usuario = usuario;
        this.senha = senha;
        this.idUsuario = idUsuario;
        this.dataCadastro = dataCadastro;
    }
    
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        Usuario.listaUsuarios = listaUsuarios;
    }

    public ArrayList<Avaliacao> getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    public void setListaAvaliacoes(ArrayList<Avaliacao> listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }
    
    
}
