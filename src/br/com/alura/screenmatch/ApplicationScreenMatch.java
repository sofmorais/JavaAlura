package br.com.alura.screenmatch;

import br.com.alura.screenmatch.utils.CalculadoraTempo;
import br.com.alura.screenmatch.utils.FiltroRecomendacao;
import br.com.alura.screenmatch.model.Episode;
import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;

import java.util.ArrayList;

public class ApplicationScreenMatch {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setNome("O Poderoso Chefão");
        movie.setAnoLancamento(1972);
        movie.setDuracaoMinutos(175);
        movie.setIncluidoNoPlano(true);

        movie.avalia(8);
        movie.avalia(10);
        movie.avalia(5);

        System.out.println(movie.exibeFichaTecnica());

        Movie movie2 = new Movie();
        movie2.setNome("Dogville");
        movie2.setDuracaoMinutos(200);
        movie2.setAnoLancamento(2003);
        movie2.avalia(10);

        ArrayList<Movie> listaFilmes = new ArrayList<>();
        listaFilmes.add(movie);
        listaFilmes.add(movie2);

        System.out.println("Tamanho da lista: " + listaFilmes.size());
        System.out.println("Nome do primeiro filme da lista: " + listaFilmes.get(0).getNome());

        Serie serieLost = new Serie();
        serieLost.setNome("Lost");
        serieLost.setAnoLancamento(2000);
        serieLost.setTemporadas(10);
        serieLost.setEpisodiosPorTemporada(10);
        serieLost.setMinutosPorEpisodio(50);

        System.out.println(serieLost.exibeFichaTecnica());
        System.out.println("Tempo para maratonar a série " + serieLost.getNome() + " é de " + serieLost.getDuracaoMinutos() + " minutos");

        System.out.println("filmes da lista: ");
        for (Movie filme : listaFilmes) {
            System.out.println("Nome do filme: " + filme.getNome());
        }


        int[] valores = new int[5];
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i] = i + 1);
        }


//        CalculadoraTempo calculadoraTempo = new CalculadoraTempo();
//        calculadoraTempo.calcularTempo(movie);
//        System.out.println("O tempo total é: " + calculadoraTempo.getTempoTotal() + " minutos");
//
//        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        filtro.filtra(movie);
//
//        Episode episodio = new Episode();
//        episodio.setNumero(1);
//        episodio.setSerie(serieLost);
//        episodio.setTotalVisualizacao(300);
//        filtro.filtra(episodio);
    }
}