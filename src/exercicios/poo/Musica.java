package exercicios.poo;

public class Musica {
    // Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int totalAvaliacoes;

    public String exibirFichaTecnica(){
        return "Informações da música\n" +
                "Nome: " + titulo + "\n" +
                "Artista: " + artista + "\n" +
                "Ano de Lançamento: " + anoLancamento + "\n" +
                "Nota: " + retornaAvaliacaoGeral() + "\n" +
                "Total de Avaliações: " + totalAvaliacoes;
        }

    public void avalia(double nota){
        avaliacao += nota;
        totalAvaliacoes++;
    }

    public double retornaAvaliacaoGeral() {
        return avaliacao / totalAvaliacoes;
    }

    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.titulo = "WILDFLOWER";
        musica.artista = "Billie Eilish";
        musica.anoLancamento = 2024;

        musica.avalia(10);
        musica.avalia(9.8);

        System.out.println(musica.exibirFichaTecnica());
    }
}

