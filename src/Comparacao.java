import java.util.Scanner;

public class Comparacao {
    // Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else if (numero1 > numero2){
            System.out.println("O primeiro número " + numero1 + " é menor do que o segundo número " + numero2);
        } else {
            System.out.println("O segundo número " + numero2 + " é maior do que o primeiro número " + numero1);
        }
    }
}