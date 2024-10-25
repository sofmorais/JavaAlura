import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;

public class Application {
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

        Serie serieLost = new Serie();
        serieLost.setNome("Lost");
        serieLost.setAnoLancamento(2000);
        serieLost.setTemporadas(10);
        serieLost.setEpisodiosPorTemporada(10);
        serieLost.setMinutosPorEpisodio(50);

        System.out.println(serieLost.exibeFichaTecnica());
        System.out.println("Tempo para maratonar a série " + serieLost.getNome() + " é de " + serieLost.getDuracaoMinutos() + " minutos");
    }
}