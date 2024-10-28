package exercicios.pooHeranca;

import java.util.List;
import java.util.stream.Collectors;

public class Carro {
    private String modelo;
    protected List<Double> precosAnuais;

    public Carro(String nomeModelo) {
        this.modelo = nomeModelo;
    }

    public List<Double> getPrecosAnuais(){
        return this.precosAnuais;
    }

    public double calcularMenorPreco(){
        double menorPreco = precosAnuais.get(0);
        for (double preco : precosAnuais) {
            if (preco < menorPreco) {
                menorPreco = preco;
            }
        }
        return menorPreco;
    }

    public double calcularMaiorPreco(){
        double maiorPreco = precosAnuais.get(0);
        for (double preco : precosAnuais) {
            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
        }
        return maiorPreco;
    }

    public String exibirInfos() {
        String precosFormatados = this.getPrecosAnuais().stream()
                .map(preco -> String.format("R$%.2f", preco).replace(",", ".")) // Substitui a vírgula por ponto
                .collect(Collectors.joining(", ")); // Junta os preços com ", " entre eles

        return "Informações do veículo:\n" +
                "Modelo: " + modelo + "\n" +
                "Preços: R$" + precosFormatados  + "\n" +
                "Menor preço: R$" + String.format("%.2f", calcularMenorPreco()).replace(",", ".") + "\n" +
                "Maior preço: R$" + String.format("%.2f", calcularMaiorPreco()).replace(",", ".");
    }

}
