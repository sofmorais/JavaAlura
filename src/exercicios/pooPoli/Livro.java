package exercicios.pooPoli;

public class Livro extends ProdutoFisico implements Calculavel {

    private double precoBase;
    private double desconto;

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase - (precoBase * desconto / 100);
    }

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setPrecoBase(54.90);
        livro.setDesconto(10);
        livro.calcularPrecoFinal();

        System.out.printf("Preço final do livro: R$%.2f%n", livro.calcularPrecoFinal());

    }
}

