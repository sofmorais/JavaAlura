package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.model.Movie;
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
