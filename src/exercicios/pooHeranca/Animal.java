package exercicios.pooHeranca;

public class Animal {
    public void emitirSom() {
        System.out.println("O animal emitiu um som.");
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        cachorro.abanarRabo();

        gato.emitirSom();
        gato.arranharMoveis();
    }
}
