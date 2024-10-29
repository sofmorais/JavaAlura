package exercicios.pooPoli;

public class ConversorMoeda implements ConversaoFinanceira{
    private double valorReal;
    private double valorDolar;

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    @Override
    public double converterDolarReal() {
        return valorDolar * valorReal;
    }

    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.setValorDolar(200);
        conversor.setValorReal(5.71);

        System.out.printf("O valor em real é: R$%.2f", conversor.converterDolarReal());
    }
}
