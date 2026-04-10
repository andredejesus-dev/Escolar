import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        int op;

        do {
            System.out.println("\n1-Cadastrar 2-Listar 0-Sair");
            op = Integer.parseInt(sc.nextLine());

            switch(op) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = Integer.parseInt(sc.nextLine());

                    double[] notas = new double[2];

                    System.out.print("Nota 1: ");
                    notas[0] = Double.parseDouble(sc.nextLine());

                    System.out.print("Nota 2: ");
                    notas[1] = Double.parseDouble(sc.nextLine());

                    System.out.print("Frequência: ");
                    int freq = Integer.parseInt(sc.nextLine());

                    alunos.add(new Aluno(nome, idade, notas, freq));

                    System.out.println("✅ Aluno cadastrado!");
                    break;

                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("⚠️ Nenhum aluno cadastrado");
                    } else {
                        for (Aluno a : alunos) {
                            System.out.println(
                                    a.getNome() + " - " + a.calcularSituacao()
                            );
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while(op != 0);
    }
}