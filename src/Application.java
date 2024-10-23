import screenmatch.Movie;

public class Application {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setNome("O Poderoso Chefão");
        movie.setAnoLancamento(1972);

        movie.avalia(8);
        movie.avalia(10);
        movie.avalia(5);

        System.out.println(movie.toString());
    }
}