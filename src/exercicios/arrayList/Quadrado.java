package exercicios.arrayList;

import java.util.ArrayList;

public class Quadrado implements Forma {
    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for (Forma forma : listaFormas) {
            System.out.println("Nome da classe da forma: " + forma.getClass().getSimpleName());
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
