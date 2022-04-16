package classes.emprestimo;

import classes.Amigo;
import classes.DVD;

import java.util.Date;

public class Emprestimo {

    private Amigo amigo;
    private DVD dvd;
    private Date dataEmprestimo;
    private Date dataDevolver;

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
}
