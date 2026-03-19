public class Mago extends Personagem {
    private int pontosDeMana;

    public Mago(String nome) {
        super(nome, 80);
        this.pontosDeMana = 100;
    }

    public void lançaFeitiço(String nomeDoFeitiço) {
        if (pontosDeMana >= 20) {
            System.out.println(nome + " lançou " + nomeDoFeitiço + " usando energia mística!");
            pontosDeMana -= 20;
        } else {
            System.out.println(nome + " está sem mana suficiente!");
        }
    }

    // Sobrescrita para mostrar o Mana no status
    @Override
    public void exibeEstado() {
        super.exibeEstado();
        System.out.println("Mana: " + pontosDeMana);
    }
}