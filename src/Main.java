import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String titular = "Jacqueline Oliveira";
        String tipoConta = "Corrente";

        double saldoInicial = 2500.99;
        double saldoAtualizado = 0;
        double valorDigitado = 0;

        int opcao = 0;

        System.out.println("************************************");
        System.out.println("Nome: " + titular);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.printf("Saldo inicial: R$%.2f",  saldoInicial);
        System.out.println("************************************");

        String menu = """
                \nOperações
                1. Consultar saldos
                2. Receber valor
                3. Transferir valor
                4. Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            System.out.println("Digite a opção desejada");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.printf("Saldo: R$%.2f", saldoInicial);
            } else if (opcao == 2) {
                System.out.println("Valor recebido: ");

                valorDigitado = sc.nextDouble();
                saldoAtualizado = saldoInicial += valorDigitado;

                System.out.printf("Saldo atualizado: R$%.2f", saldoAtualizado);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                valorDigitado = sc.nextDouble();

                if (valorDigitado > saldoInicial) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldoAtualizado = saldoInicial -= valorDigitado;
                    System.out.printf("Saldo atualizado: R$%.2f", saldoAtualizado);
                }
            } else if (opcao != 4){
                System.out.println("Opção inválida.");
            }
        }
    }
}