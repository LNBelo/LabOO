public class Arqueiro extends Personagem {
    private int quantidadeDeFlechas;

    public Arqueiro(String nome) {
        // Arqueiros têm vida intermediária e começam com algumas flechas
        super(nome, 100);
        this.quantidadeDeFlechas = 15;
    }

    public void atireFlecha() {
        if (quantidadeDeFlechas > 0) {
            System.out.println(nome + " disparou uma flecha certeira!");
            quantidadeDeFlechas--; // Diminuímos o estoque
        } else {
            System.out.println(nome + " tentou atirar, mas a aljava está vazia!");
        }
    }

    public void fabriqueFlechas(int quantidade) {
        System.out.println(nome + " parou para fabricar " + quantidade + " novas flechas.");
        this.quantidadeDeFlechas += quantidade;
    }

    @Override
    public void exibeEstado() {
        super.exibeEstado();
        System.out.println("Flechas restantes: " + quantidadeDeFlechas);
    }
}