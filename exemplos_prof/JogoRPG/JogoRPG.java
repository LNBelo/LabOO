public class JogoRPG {
    public static void main(String[] args) {
        Mago mestreDosMagos = new Mago("Gandalf");
        Guerreiro cavaleiroReal = new Guerreiro("Aragorn");
        Arqueiro arqueiro = new Arqueiro("Legolas");

        System.out.println("--- INICIO DA AVENTURA ---");
         // Exibe os estado inicial
        mestreDosMagos.exibeEstado();
        cavaleiroReal.exibeEstado();
        arqueiro.exibeEstado();

        // Todos herdaram 'mover' da classe Personagem
        mestreDosMagos.mova("Floresta");
        cavaleiroReal.mova("Caverna");
        arqueiro.mova("Montanha");

        // Cada um usa seu comportamento específico
        mestreDosMagos.lançaFeitiço("Bola de Fogo");
        cavaleiroReal.ataqueComEspada();;
        arqueiro.atireFlecha();

        // Arqueiro possui lógica própria de munição
        arqueiro.exibeEstado();
        arqueiro.fabriqueFlechas(5);

        // Exibindo os estado final
        arqueiro.exibeEstado();
        mestreDosMagos.exibeEstado();
        cavaleiroReal.exibeEstado();
    }
}