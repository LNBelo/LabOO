public class Endereco extends App{
    protected String logradouro, numero, complemento, bairro, cidade, estado, cep;

    public Endereco (String logradouro, String numero, String complemento,
                    String bairro, String cidade, String estado, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getEndereco(){
        String endereco_completo = this.logradouro + ", " + this.numero + ", " +
            this.complemento + " - " + this.bairro + ", " + this.cidade + " - " +
            this.estado + ", " + this.cep;
        return endereco_completo;
    }
}
