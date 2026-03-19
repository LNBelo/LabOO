public class Personagem {
    protected String nome;
    protected int pontosDeVida;
    protected int nivel;

    public Personagem(String nome, int pontosDeVida) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.nivel = 1; 
    }

    public void mova(String direcao) {
        System.out.println(nome + " está caminhando para o " + direcao);
    }

    public void exibeEstado() {
        System.out.println("\n--- ESTADO DE " + nome.toUpperCase() + " ---");
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + pontosDeVida);
    }
}

