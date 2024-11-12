package exercicios.arrayList;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return """
                Nome do produto: %s
                Preço: R$%.2f
                Quantidade: %d
                Validade: %s
                """.formatted(getNome(), getPreco(), getQuantidade(), getDataValidade());
    }
}
