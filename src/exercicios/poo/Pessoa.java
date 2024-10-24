package exercicios.poo;

public class Pessoa {
    // Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
    public String exibeMensagem(){
        return "Olá, mundo!";
    }
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        System.out.println(pessoa.exibeMensagem());
    }
}
