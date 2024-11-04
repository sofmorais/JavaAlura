package exercicios.pooPoli;

public class Servico implements Vendavel {
    private double precoHora;

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }

    @Override
    public double calcularPrecoTotal(int horasServico) {
        return precoHora * horasServico;
    }

    public static void main(String[] args) {
        Servico servico = new Servico();
        servico.precoHora = 50;
        servico.aplicarDesconto(5);

        int horasServico = 6;
        System.out.println("Valor do serviço: R$" + servico.calcularPrecoTotal(horasServico));
    }
}