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

}
