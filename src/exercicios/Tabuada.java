package exercicios;

import java.util.Scanner;

public class Tabuada {
    // Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDigitado = 0;

        System.out.println("Digite um número");
        numeroDigitado = sc.nextInt();
        System.out.println("Tabuada do " + numeroDigitado);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroDigitado + " x " + i + " = " + (numeroDigitado * i));
        }
    }
}