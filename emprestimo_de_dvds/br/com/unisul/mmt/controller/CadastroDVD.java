package br.com.unisul.mmt.controller;

import br.com.unisul.mmt.model.DVD;
import br.com.unisul.mmt.model.Genero;
import br.com.unisul.mmt.model.Amigo;

import java.util.ArrayList;
import java.util.List;

public class CadastroDVD {

    private List<DVD> dvds;

    public CadastroDVD() {
        this.dvds = new ArrayList<>();
    }

    public void inclui(Amigo amigo) {

    }

    public void altera(int i) {

    }

    public void exclui(int i) {

    }

    public List<DVD> getDvds() {
        return dvds;
    }

    public void setDvds(List<DVD> dvds) {
        this.dvds = dvds;
    }
}
