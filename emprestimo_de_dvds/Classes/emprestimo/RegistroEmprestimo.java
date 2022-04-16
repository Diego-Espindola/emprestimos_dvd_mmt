package classes.emprestimo;

import classes.Amigo;
import classes.DVD;

import java.util.ArrayList;
import java.util.List;

public class RegistroEmprestimo {
    private List<Emprestimo> emprestimos;
    private List<RelatorioEmprestimo> relatorioEmprestimos;

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

    public List<RelatorioEmprestimo> getRelatorioEmprestimos() {
        return relatorioEmprestimos;
    }

    public void setRelatorioEmprestimos(List<RelatorioEmprestimo> relatorioEmprestimos) {
        this.relatorioEmprestimos = relatorioEmprestimos;
    }
}
