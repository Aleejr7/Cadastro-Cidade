package br.com.ada.cadastrocrud.model;

import java.util.UUID;

public class Cidade {

    private UUID id;
    private String nome;
    private String seuEstado;

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSeuEstado() {
        return seuEstado;
    }
    public void setSeuEstado(String seuEstado) {
        this.seuEstado = seuEstado;
    }
}
