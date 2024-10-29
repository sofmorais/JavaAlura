package br.com.alura.screenmatch.utils;

import br.com.alura.screenmatch.model.Title;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void calcularTempo(Title titulo){
        this.tempoTotal += titulo.getDuracaoMinutos();
    }
}
