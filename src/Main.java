import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String titular = "Jacqueline Oliveira";
        String tipoConta = "Conta corrente";
        double saldoInicial = 2500;
        double saldoAtualizado = 0;
        double valorDigitado = 0;

        int opcao = 0;

        System.out.println("************************************");
        System.out.println("Nome: " + titular);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$" + saldoInicial);
        System.out.println("************************************");


        while (opcao != 4) {
            System.out.println("\nOperações: ");
            System.out.println("1. Consultar saldos");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair\n");

            System.out.println("Digite a opção desejada");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo: " + saldoInicial);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber: ");

                valorDigitado = sc.nextDouble();
                saldoAtualizado = saldoInicial + valorDigitado;

                System.out.println("Saldo atualizado: " + saldoAtualizado);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                valorDigitado = sc.nextDouble();

                if (valorDigitado > saldoInicial) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldoAtualizado -= valorDigitado;
                    System.out.println("Saldo atualizado: " + saldoAtualizado);
                }
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}