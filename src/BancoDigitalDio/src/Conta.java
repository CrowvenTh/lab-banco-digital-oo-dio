public class Conta {
    private String nome;
    private int agencia;
    private int numero;
    private double saldo = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Double realizarDeposito(double deposito) {
        System.out.println("Depósito de R$" + deposito + " realizado com sucesso.");
        saldo += deposito;
        System.out.println("Saldo autal: R$" + getSaldo());
        return saldo;
    }

    public Double realizarSaque(Double saque) {
        if (saque > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= saque;
            System.out.println("Saque de: R$" + saque + " realizado com sucesso.");
            System.out.println("Saldo autal: R$" + getSaldo());
            ;
        }
        return saque;
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + getSaldo());
    }

    public void realizarTransferencia(double saldo, Conta contaPoupanca) {
        this.realizarSaque(saldo);
        contaPoupanca.realizarDeposito(saldo);
        System.out.println("Tranferência realizada com sucesso!");

    }
}
