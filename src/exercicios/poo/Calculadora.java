package exercicios.poo;

public class Calculadora {
    // Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
    public int dobraNumero(int numero){
        return numero * 2;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int numero = 9;
        int resultado = calculadora.dobraNumero(numero);
        System.out.println(resultado);
    }
}
