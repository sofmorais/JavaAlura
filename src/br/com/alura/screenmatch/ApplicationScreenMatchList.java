package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Title;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ApplicationScreenMatchList {
    public static void main(String[] args) {
        Movie movie = new Movie("O Poderoso Chefão", Year.of(1972));
        movie.avalia(9);
        Movie movie2 = new Movie("Dogville", Year.of(2003));
        movie2.avalia(10);
        Movie movie3 = new Movie("Avatar", Year.of(2023));
        movie3.avalia(8);
        Serie serieLost = new Serie("Lost", Year.of(2000));

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(movie);
        lista.add(movie2);
        lista.add(movie3);
        lista.add(serieLost);

        for (Title title : lista) {
            System.out.println("Nome: " + title.getNome());

            if (title instanceof Movie film) {
                System.out.println("Classificação: " + film.getClassificacao());
            }
        }

        Collections.sort(lista);
        System.out.println(lista);

    }
}
