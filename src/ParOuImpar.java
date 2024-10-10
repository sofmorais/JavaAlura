import java.util.Scanner;

public class ParOuImpar {
    // Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDigitado = 0;

        System.out.println("Digite um número");
        numeroDigitado = sc.nextInt();

        if (numeroDigitado % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
    }
}