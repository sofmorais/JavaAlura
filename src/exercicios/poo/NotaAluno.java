package exercicios.poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotaAluno {
    //Desenvolva uma classe NotaAluno com os atributos privados nome e notas.
    // Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
    private String nome;
    private double media;
    private double[] notas;

    //private List<Double> notas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        for (double nota : notas) {
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. A nota deve ser entre 0 e 10.");
            }
        }
        this.notas = notas;
    }

    public void calcularMedia() {
        if (notas == null || notas.length == 0) {
            this.media = 0; // Define a média como 0 se não houver notas
            return;
        }

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        this.media = soma / notas.length;
    }

    public static void main(String[] args) {
        NotaAluno aluno = new NotaAluno();
        aluno.setNome("João");

        double[] notas = {8.5, 7.0, 9.2, 6.8};
        aluno.setNotas(notas);
        aluno.calcularMedia();

        double[] notasDoAluno = aluno.getNotas();

        System.out.println("A média do aluno " + aluno.getNome() + " foi " + aluno.getMedia());
        System.out.println("As notas do aluno " + aluno.getNome() + " foram " + Arrays.toString(notasDoAluno));

//        System.out.println("As notas do aluno " + aluno.getNome() + " foram: ");
//        String[] notasFormatadas = Arrays.stream(notasDoAluno)
//                .mapToObj(String::valueOf)
//                .toArray(String[]::new);
//        System.out.println(String.join(", ", notasFormatadas));

    }
}
