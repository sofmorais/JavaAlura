package exercicios.pooHeranca;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Miau miau");
    }

    public void arranharMoveis(){
        System.out.println("O gato está arranhando os móveis.");

    }
}
