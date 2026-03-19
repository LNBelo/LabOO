public class Cliente extends App {
    protected String nome, cpf;
    protected Endereco endereco;
    
    public Cliente (String nome, String cpf, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
}