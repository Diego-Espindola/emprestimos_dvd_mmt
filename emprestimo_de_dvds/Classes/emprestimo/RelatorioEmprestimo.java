package classes.emprestimo;

import java.util.List;

public class RelatorioEmprestimo {

    private List<RegistroEmprestimo> emprestimos;

    public void imprimeRelatorio() {
    }

    public List<RegistroEmprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<RegistroEmprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
}
