package exercicios.pooPoli;

public class TabuadaMultiplicacao implements Tabuada {
    private int numero;


    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7);
    }
}
