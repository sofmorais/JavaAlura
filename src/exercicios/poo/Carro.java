package exercicios.poo;

import java.time.Year;

public class Carro {

    // Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

    private String modelo;
    private int anoFabricacao;
    private String cor;

    public String exibirFichaTecnicaConcat() {
        return "Informações do veículo\n" +
                "Modelo: " + modelo + "\n" +
                "Ano de Fabricação: " + anoFabricacao + "\n" +
                "Cor: " + cor + "\n" +
                "Idade do veículo: " + calcularIdade() + " anos";
    }
    public String exibirFichaTecnicaFormatted() {
        return """
                Informações do veículo
                Modelo: %s
                Ano de Fabricação: %d
                Cor: %s
                Idade do veículo: %d anos
                """.formatted(modelo, anoFabricacao, cor, calcularIdade());
    }

    public int calcularIdade() {
        int anoAtual = Year.now().getValue();
        return anoAtual - anoFabricacao;
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.anoFabricacao = 2014;
        carro.modelo = "Celta";
        carro.cor = "Prata";

        System.out.println(carro.exibirFichaTecnicaFormatted());
    }

}