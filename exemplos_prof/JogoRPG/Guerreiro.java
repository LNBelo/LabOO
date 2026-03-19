public class Guerreiro extends Personagem {
    private int pontosDeEstamina;

    public Guerreiro(String nome) {
        super(nome, 150); // Guerreiros têm muita vida
        this.pontosDeEstamina = 50;
    }

    public void ataqueComEspada() {
        if (pontosDeEstamina >= 10) {
            System.out.println(nome + " desferiu um golpe pesado com a espada!");
            pontosDeEstamina -= 10;
        } else {
            System.out.println(nome + " está exausto para atacar!");
        }
    }
}
