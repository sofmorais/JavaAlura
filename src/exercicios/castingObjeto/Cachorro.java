package exercicios.castingObjeto;

public class Cachorro extends Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Au au");
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");

        if (cachorro instanceof Animal) {
            Animal animal = (Animal) cachorro;
            System.out.println("Casting realizado com sucesso!");

            System.out.println("Nome: " + cachorro.nome);
            animal.fazerBarulho();
        } else {
            System.out.println("O objeto não é uma instância de Animal");
        }
    }

}
