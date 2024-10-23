package screenmatch;

import java.time.Year;
import java.util.Locale;

public class Movie {
    private String nome;
    private Year anoLancamento;
    private int duracaoMinutos;
    double avaliacao;
    private int totalAvaliacoes;
    private Boolean inclusoNoPlano;

    // Getters and Setters
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

    public double getAvaliacao() {
        return avaliacao;
    }

    public Boolean isInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public void setIncluidoNoPlano(Boolean incluidoNoPlano) {
        this.inclusoNoPlano = incluidoNoPlano;
    }

    @Override
    public String toString() {
        Locale.setDefault(new Locale("en", "US"));
        return "Informações do filme\n" +
                "Nome: " + nome +
                ", \nAno de Lançamento: " + anoLancamento +
                ", \nDuração: " + duracaoMinutos + " minutos" +
                ", \nNota: %.2f".formatted(retornaAvaliacaoGeral()) +
                ", \nTotal de Avaliações: " + totalAvaliacoes +
                ", \nIncluso no Plano: " + inclusoNoPlano;
    }

    public void avalia(double nota) {
        avaliacao += nota;
        totalAvaliacoes++;
    }

    public double retornaAvaliacaoGeral() {
        return avaliacao / totalAvaliacoes;
    }

}