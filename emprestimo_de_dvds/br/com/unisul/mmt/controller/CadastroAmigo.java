package br.com.unisul.mmt.controller;

import br.com.unisul.mmt.model.Amigo;

import java.util.ArrayList;
import java.util.List;

public class CadastroAmigo {

    private List<Amigo> amigos;

    public CadastroAmigo() {
        this.amigos = new ArrayList<>();
    }


    public void inclui(Amigo amigo) {
        this.amigos.add(amigo);
    }

    public void altera(int i) {

    }

    public void exclui(int i) {

    }

    @Override
    public String toString() {
        return "CadastroAmigo{" +
                "amigos=" + amigos +
                '}';
    }
}
