public class Amigo extends Pessoa{
    private long numTelefone;
    private String email;
    private String endereco;

    public Amigo(String nome, String email, String endereco, long numTelefone) {
        super(nome);
        this.email = email;
        this.endereco = endereco;
        this.numTelefone = numTelefone;
    }

    public Amigo(){
        super();

    }
}
