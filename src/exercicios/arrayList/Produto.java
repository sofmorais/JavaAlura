package exercicios.arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return """
                Nome do produto: %s
                Preço: R$%.2f
                Quantidade: %d
                """.formatted(nome, preco, quantidade);
    }

    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("TV", 2499.90, 2);
        Produto produto2 = new Produto("PC", 3499.90, 1);
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite", 6.99, 1, "20/12/2024");

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produtoPerecivel);

        System.out.println("Tamanho da lista de produtos: " + listaProdutos.size());
        System.out.println("Produto na posição 1: " + listaProdutos.get(1).getNome());

        double somaPrecos = 0;

        System.out.println("Produtos na lista: ");
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.printf("Preço médio dos produtos: R$%.2f", precoMedio);
    }
}
