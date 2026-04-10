public class Aluno extends Pessoa {
    private double[] notas;
    private int frequencia;

    public Aluno(String nome, int idade, double[] notas, int frequencia) {
        super(nome, idade);
        this.notas = notas;
        this.frequencia = frequencia;
    }

    public String calcularSituacao() {
        double media = (notas[0] + notas[1]) / 2;
        return (media >= 6 && frequencia >= 75)
                ? "Aprovado" : "Reprovado";
    }
}