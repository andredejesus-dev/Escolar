public class Aluno {

    private String nome;
    private int idade;
    private double[] notas;
    private int frequencia;

    // Construtor
    public Aluno(String nome, int idade, double[] notas, int frequencia) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
        this.frequencia = frequencia;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    // Lógica da situação
    public String calcularSituacao() {
        double media = (notas[0] + notas[1]) / 2;

        if (frequencia < 75) {
            return "Reprovado por falta";
        } else if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado por nota";
        }
    }
}