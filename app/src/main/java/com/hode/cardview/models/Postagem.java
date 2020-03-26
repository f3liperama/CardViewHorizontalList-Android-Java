package com.hode.cardview.models;

import android.graphics.drawable.Drawable;

public class Postagem {

    private String nome;
    private String postagem;
    private int thumbnail;

    public Postagem(String nome, String postagem, int thumbnail) {
        this.nome = nome;
        this.postagem = postagem;
        this.thumbnail = thumbnail;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPostagem() {
        return postagem;
    }

    public void setPostagem(String postagem) {
        this.postagem = postagem;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
