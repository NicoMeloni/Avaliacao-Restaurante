/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliaacaorestaurante;

import java.util.ArrayList;

/**
 *
 * @author Nicopau
 */

public class Restaurante {
    int idRestaurante, idUsuario;
    private String nome;
    private Usuario dono;
    private ArrayList<Prato> menu = new ArrayList<>();
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    public Restaurante(String nome, Usuario dono) {
        this.nome = nome;
        this.dono = dono;
    }

    public Restaurante(int idRestaurante, int idUsuario, String nome) {
        this.idRestaurante = idRestaurante;
        this.idUsuario = idUsuario;
        this.nome = nome;
        
    } 
    
    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public int getIdUser() {
        return idUsuario;
    }

    public void setIdUser(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }   
}