package exercicios.pooHeranca;

public class ContaBancaria{
    protected  double saldo;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);

    }

    public void sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        }
        System.out.println("Saldo insuficiente para saque.");
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();

        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();
    }
}
