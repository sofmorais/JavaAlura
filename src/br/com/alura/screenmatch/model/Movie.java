package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.utils.Classificacao;

import java.time.Year;

public class Movie extends Title implements Classificacao {
    private String diretor;

    public Movie(String nome, Year anoLancamento) {
        super(nome, anoLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) retornaAvaliacaoGeral() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}