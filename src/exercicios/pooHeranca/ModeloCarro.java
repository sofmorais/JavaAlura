package exercicios.pooHeranca;

import java.util.Arrays;
import java.util.List;

public class ModeloCarro extends Carro{
    public ModeloCarro(String nomeModelo) {
        super(nomeModelo);
    }

    public void definirPrecos(List<Double> precos) {
        this.precosAnuais = precos;
    }

    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro("Sandero");

        List<Double> precos = Arrays.asList(35000.90, 30000.90, 40500.90);
        carro.definirPrecos(precos);
        System.out.println(carro.exibirInfos());
    }

}
