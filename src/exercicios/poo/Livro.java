package exercicios.poo;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String exibirDetalhes(){
        return "Detalhes do livro:" +
                "Título: " + getTitulo() + "\n" +
                "Autor: " + getAutor() + "\n";
    }

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Tudo é Rio");
        livro.setAutor("Carla Madeira");

        String detalhesLivro = livro.exibirDetalhes();

        System.out.println(detalhesLivro);
    }
}
