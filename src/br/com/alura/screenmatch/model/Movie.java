package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.utils.Classificacao;

public class Movie extends Title implements Classificacao {
    private String diretor;

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
}