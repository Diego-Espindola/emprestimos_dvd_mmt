package br.com.unisul.mmt.view;

import br.com.unisul.mmt.model.Amigo;
import br.com.unisul.mmt.model.DVD;
import br.com.unisul.mmt.controller.RelatorioEmprestimo;

public class Interface {

    private RelatorioEmprestimo relatorioEmprestimo;

    public Interface() {
    }

    public Interface(RelatorioEmprestimo relatorioEmprestimo) {
        this.relatorioEmprestimo = relatorioEmprestimo;
    }

    public void imprime(String a) {

    }

    public void imprimeMenu() {

    }

    public DVD leDVD() {
        return new DVD();
    }

    public Amigo leAmigo() {
        return new Amigo();
    }

    public void leEmprestimo() {

    }

    public void alertaFaixaEtaria(Amigo amigo, DVD dvd) {

    }

}