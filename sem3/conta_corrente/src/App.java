public class App {
    public static void main(String[] args) {
        ContaCorrente cc_conjunta = new ContaCorrente(150.13, "7978-15");
        Endereco endereco_casal = new Endereco(
            "Rua das Flores", "12b", "S/C", "Jardim Ametista",
            "Campinas", "SP", "08865-451");
        
        Cliente cliente1 = new Cliente("Ana Karla", "123.321.456-0", endereco_casal);
        ContaCorrente cc1 = new ContaCorrente(188.09, "7912-10");

        Cliente cliente2 = new Cliente("Paulo Henrique", "321.123.879-1", endereco_casal);
        ContaCorrente cc2 = new ContaCorrente(1.09, "7918-10");
        
        ContaCorrente cc3 = new ContaCorrente(178.09, "7912-10");
        Endereco endereco_cliente3 = new Endereco(
            "Av. das Nações", "3.754", "Piso superior", "Paraiso",
            "São Paulo", "SP", "04786-451");
        Cliente cliente3 = new Cliente("Jonas", "456.123.321.-0", endereco_cliente3);

        System.out.println("--- CLIENTE 1 ---");
        System.out.println("cliente: " + cliente1.nome + " | " + "cpf: " + cliente1.cpf);
        System.out.println("endereco: " + endereco_casal.getEndereco());
        System.out.println("conta corrente: " + cc1.numero_cc + " | " + "saldo: " + cc1.saldo);
        System.out.println("conta conjunta: " + cc_conjunta.numero_cc + " | " + "saldo: " + cc_conjunta.saldo);
        System.out.print("\n");

        System.out.println("--- CLIENTE 2 ---");
        System.out.println("cliente: " + cliente2.nome + " | " + "cpf: " + cliente2.cpf);
        System.out.println("endereco: " + endereco_casal.getEndereco());
        System.out.println("conta corrente: " + cc2.numero_cc + " | " + "saldo: " + cc2.saldo);
        System.out.println("conta conjunta: " + cc_conjunta.numero_cc + " | " + "saldo: " + cc_conjunta.saldo);
        System.out.print("\n");

        System.out.println("--- CLIENTE 3 ---");
        System.out.println("cliente: " + cliente3.nome + " | " + "cpf: " + cliente3.cpf);
        System.out.println("endereco: " + endereco_cliente3.getEndereco());
        System.out.println("conta corrente: " + cc3.numero_cc + " | " + "saldo: " + cc3.saldo);
    };
}


