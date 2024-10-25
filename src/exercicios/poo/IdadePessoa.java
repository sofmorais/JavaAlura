package exercicios.poo;

public class IdadePessoa {
    // Crie uma classe IdadePessoa com os atributos privados nome e idade.
    //  Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if(idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " não é maior de idade.");
        }

    }

    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Maria");
        pessoa.setIdade(24);

        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos");
        pessoa.verificarIdade();
    }
}
