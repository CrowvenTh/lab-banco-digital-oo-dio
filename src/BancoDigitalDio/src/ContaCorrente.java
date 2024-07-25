import java.util.Scanner;

public class ContaCorrente extends Conta {
    public void executarContaCorrente() {
        Scanner entrada = new Scanner(System.in);
        Conta cc = new ContaCorrente();

        System.out.println("=== Conta Corrente ===");
        System.out.println("Insira seu nome");
        this.setNome(entrada.next());
        System.out.println("Insira a Agência");
        this.setAgencia(entrada.nextInt());
        System.out.println("Insira o numero da conta");
        this.setNumero(entrada.nextInt());

        Boolean controlador = true;
        System.out.println("=== Bem vindo " + getNome().toUpperCase() + " ===");
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número: " + getNumero());
        while (controlador) {

            System.out.println("\nSelecione a operação");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Verificar Saldo");
            System.out.println("4 - Transferir");
            System.out.println("0 - Encerrar");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira a o valor do depósito");
                    cc.realizarDeposito(entrada.nextDouble());
                    break;
                case 2:
                    System.out.println("Insira o valor do saque");
                    cc.realizarSaque(entrada.nextDouble());
                    break;
                case 3:
                    cc.verificarSaldo();
                    break;
                case 4:

                    break;
                case 0:
                    System.out.println("Programa encerrado");
                    controlador = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
