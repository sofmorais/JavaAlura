package exercicios.poo;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual){
        double desconto = this.preco * (percentual / 100);
        this.preco -= desconto;

        // Cálculo direto
        // this.preco -= this.preco * (percentual / 100);

    }

    public void aplicarDescontoFracaoRestante(double percentual){
        // Usa-se 1 - percentual / 100 para pegar o que sobra do preço original após aplicar o desconto
        // Converte o percentual em uma fração
        double fator = 1 - (percentual / 100);

        // Multiplica o preço original pelo fator pra aplicar o desconto
        this.preco = this.preco * fator;

        // OU
        // this.preco = this.preco * (1 - percentual / 100);
    }

    public static void main(String[] args) {

    }
}