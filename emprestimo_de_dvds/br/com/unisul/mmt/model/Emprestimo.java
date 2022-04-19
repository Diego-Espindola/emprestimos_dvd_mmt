package br.com.unisul.mmt.model;

import java.util.Date;

public class Emprestimo {

    private Date dataEmprestimo;
    private Date dataDevolver;
    private Amigo amigo;
    private DVD dvd;

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolver() {
        return dataDevolver;
    }

    public void setDataDevolver(Date dataDevolver) {
        this.dataDevolver = dataDevolver;
    }

    public Amigo getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = amigo;
    }

    public DVD getDvd() {
        return dvd;
    }

    public void setDvd(DVD dvd) {
        this.dvd = dvd;
    }
}
