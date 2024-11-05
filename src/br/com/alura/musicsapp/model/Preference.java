package br.com.alura.musicsapp.model;

public class Preference {

    public void incluir(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + "é considerado sucesso absoluto" +
                    "Classificação: " + audio.getClassificacao());

        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo.");
        }
    }
}
