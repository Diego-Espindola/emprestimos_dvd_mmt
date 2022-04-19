package br.com.unisul.mmt.model;

public class FaixaEtaria {

    private int de;
    private int ate;

    public boolean ehAbaixo(FaixaEtaria faixaEtaria) {
        return true;
    }

    public int getDe() {
        return de;
    }

    public void setDe(int de) {
        this.de = de;
    }

    public int getAte() {
        return ate;
    }

    public void setAte(int ate) {
        this.ate = ate;
    }
}
