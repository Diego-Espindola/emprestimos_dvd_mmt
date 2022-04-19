package br.com.unisul.mmt.model;

public class DVD {

    private String titulo;
    private String sinopse;
    private Pessoa artistaPrincipal;
    private Pessoa diretor;

    private FaixaEtaria classificacao;

    private Genero genero;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Pessoa getArtistaPrincipal() {
        return artistaPrincipal;
    }

    public void setArtistaPrincipal(Pessoa artistaPrincipal) {
        this.artistaPrincipal = artistaPrincipal;
    }

    public Pessoa getDiretor() {
        return diretor;
    }

    public void setDiretor(Pessoa diretor) {
        this.diretor = diretor;
    }

    public FaixaEtaria getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(FaixaEtaria classificacao) {
        this.classificacao = classificacao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
