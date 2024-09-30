
public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\n---Conta 1---");
        ContaCorrente conta1 = new ContaCorrente(140000, 1, "Maria", 100000000, "Ativa");
        conta1.imprimirContaCorrete();

        System.out.println("\n---Conta 2---");
        ContaCorrente conta2 = new ContaCorrente(130000, 2, "Lia", 100000000, "Ativa");
        conta2.imprimirContaCorrete();

        System.out.println("\nDespositaram na conta 1 da cliente Maria");
        conta1.depositar(5000);

        System.out.println("\nRetiraram na conta 1 da cliente Maria");
        conta1.levantar(1000);

        System.out.println("\nDespositaram na conta 2 da cliente Lia");
        conta2.depositar(5000);

        System.out.println("\nRetiraram na conta 2 da cliente Lia");
        conta2.levantar(15000);


        System.out.println("\nTransferência da conta 1 para a conta 2");
        conta1.transferir(conta2, 4000);

        System.out.println("\nTransferência da conta 2 para a conta 1");
        conta2.transferir(conta1, 4000);

    }
}