package br.com.alura.screenmatch.model;

import java.time.Year;
import java.util.Locale;

public class Title {
    private String nome;
    private Year anoLancamento;
    private int duracaoMinutos;
    private double avaliacao;
    private int totalAvaliacoes;
    private Boolean inclusoNoPlano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Year getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = Year.of(anoLancamento);
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracao) {
        if (duracao >= 0) {
            this.duracaoMinutos = duracao;
        } else {
            System.out.println("A duração não pode ser negativa.");
        }
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public Boolean isInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public void setIncluidoNoPlano(Boolean incluidoNoPlano) {
        this.inclusoNoPlano = incluidoNoPlano;
    }

    public String exibeFichaTecnica() {
        Locale.setDefault(new Locale("en", "US"));
        return "Informações do filme\n" +
                "\nNome: " + getNome() +
                "\nAno de Lançamento: " + getAnoLancamento() +
                "\nDuração: " + getDuracaoMinutos() + " minutos" +
                "\nNota: %.2f".formatted(retornaAvaliacaoGeral()) +
                "\nTotal de Avaliações: " + getTotalAvaliacoes() +
                "\nIncluso no Plano: " + isInclusoNoPlano();
    }

    public void avalia(double nota) {
        avaliacao += nota;
        totalAvaliacoes++;
    }

    public double retornaAvaliacaoGeral() {
        return avaliacao / totalAvaliacoes;
    }

}
