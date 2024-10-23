package exercicios;

import java.util.Scanner;

public class PositivoNegativo {
    // Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
    }
}