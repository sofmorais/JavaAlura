package exercicios.pooPoli;

public class Produto implements Vendavel {
    private double precoUnitario;


    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.precoUnitario = 120;
        produto.aplicarDesconto(10);
        int quantidade = 10;
        System.out.println("O preço total é R$:" + produto.calcularPrecoTotal(quantidade));

    }
}
