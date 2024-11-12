package exercicios.arrayList;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;

    @Override
    public String toString(){
        return "Nome: " + nome + " (Idade: " + idade + ")";
    }

    public static void main(String[] args) {
        // arrays são estruturas de dados que permitem armazenar uma coleção de elementos do mesmo tipo
        // arrays não possuem métodos que permitam a inserção, remoção ou pesquisa de elementos de forma eficiente.
        // o tamanho de um array é fixo e não pode ser alterado após a sua criação

        // Não se deve utilizar arrays para representar uma coleção de elementos, mas sim alguma classe do Java,
        // como a ArrayList, que encapsula e abstrai um array, facilitando a utilização via métodos

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Júlia";
        pessoa1.idade = 25;
        listaPessoas.add(pessoa1);

        System.out.println(pessoa1);

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();

        pessoa2.nome = "Maria";
        pessoa2.idade = 18;
        listaPessoas.add(pessoa2);

        pessoa3.nome = "Alice";
        pessoa3.idade = 21;
        listaPessoas.add(pessoa3);

        pessoa4.nome = "Clara";
        pessoa4.idade = 24;
        listaPessoas.add(pessoa4);

        System.out.println("Tamanho da lista: " + listaPessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaPessoas.get(0).nome);

        System.out.println("Lista com todas as pessoas:");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }

    }
}
