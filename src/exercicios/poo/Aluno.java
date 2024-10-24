package exercicios.poo;

public class Aluno {
    // Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
    private String nome;
    private int idade;

    public String exibirInformacoes(){
        return """
                Informações do aluno
                Nome: %s
                Idade: %d anos
                """.formatted(nome, idade);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Maria";
        aluno.idade = 23;

        System.out.println(aluno.exibirInformacoes());
    }
}
