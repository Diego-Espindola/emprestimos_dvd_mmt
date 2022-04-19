package br.com.unisul.mmt.model;

public class Amigo extends Pessoa {
    private long numTelefone;
    private String email;
    private String endereco;
    private FaixaEtaria faixaEtaria;

    public Amigo() {
    }

    public Amigo(String nome, String email, String endereco, long numTelefone, FaixaEtaria faixaEtaria) {
        super(nome);
        this.email = email;
        this.endereco = endereco;
        this.numTelefone = numTelefone;
        this.faixaEtaria = faixaEtaria;
    }

    public long getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(long numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public FaixaEtaria getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "numTelefone=" + numTelefone +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", faixaEtaria=" + faixaEtaria +
                '}';
    }
}
