package br.com.alura.musicsapp.model;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        System.out.println("Curtindo...");
        this.totalCurtidas++;
    }

    public void reproduzir(){
        System.out.println("Reproduzindo...");
        this.totalReproducoes++;
    }

}