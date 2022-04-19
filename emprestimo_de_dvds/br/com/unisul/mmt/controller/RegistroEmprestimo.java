package br.com.unisul.mmt.controller;

import br.com.unisul.mmt.model.Amigo;
import br.com.unisul.mmt.model.DVD;
import br.com.unisul.mmt.model.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class RegistroEmprestimo {
    public List<Emprestimo> emprestimos;
    private RelatorioEmprestimo relatorioEmprestimo;

    public RegistroEmprestimo() {
        this.emprestimos = new ArrayList<>();
    }

    public void empresta(Amigo amigo, DVD dvd) {

    }

    public void devolve(DVD dvd) {

    }

    private boolean estahEmprestado(DVD dvd) {
        return true;
    }

    private boolean faixaEtariaAbaixo(Amigo amigo, DVD dvd) {
        return true;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public RelatorioEmprestimo getRelatorioEmprestimo() {
        return relatorioEmprestimo;
    }

    public void setRelatorioEmprestimo(RelatorioEmprestimo relatorioEmprestimos) {
        this.relatorioEmprestimo = relatorioEmprestimos;
    }
}
