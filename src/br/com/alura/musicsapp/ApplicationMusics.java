package br.com.alura.musicsapp;

import br.com.alura.musicsapp.model.Music;
import br.com.alura.musicsapp.model.Podcast;
import br.com.alura.musicsapp.model.Preference;

public class ApplicationMusics {
    public static void main(String[] args) {
        Music music = new Music();
        music.setTitulo("Forever");
        music.setArtista("Kiss");


        for (int i = 0; i < 10; i++) {
            music.reproduzir();
        }

        for (int i = 0; i < 5; i++) {
            music.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Podcast teste");
        podcast.setHost("Alura");

        for (int i = 0; i < 10; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 15; i++) {
            podcast.curte();
        }

        Preference preferencia = new Preference();
        preferencia.incluir(music);
        preferencia.incluir(podcast);

    }
}
