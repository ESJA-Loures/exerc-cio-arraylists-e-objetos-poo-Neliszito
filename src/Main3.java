import java.util.ArrayList;
import java.util.Scanner;

class dadosAluno {
    String nome;
    int numero;

    public dadosAluno(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String toString() {
        return "Nº" + numero + " | " + nome;
    }
}

public class Main3 {

    static ArrayList<dadosAluno> dadosAlunos = new ArrayList<>();
    static Scanner leitor = new Scanner(System.in);
    static int opcao = 0;

    public static void main(String[] args) {

        while (opcao != 4) {
            System.out.println("\n--- TODO LIST ---");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Ver alunos");
            System.out.println("3. Remover aluno");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do aluno a adicionar: ");
                    String nomeAluno = leitor.nextLine();
                    System.out.print("Número do aluno: ");
                    int numAluno = leitor.nextInt();
                    leitor.nextLine();
                    dadosAlunos.add(new dadosAluno(nomeAluno, numAluno));
                    System.out.println("Aluno adicionado!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Alunos ---");
                    if (dadosAlunos.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (dadosAluno aluno : dadosAlunos) {
                            System.out.println(aluno);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Número do aluno a remover: ");
                    int id = leitor.nextInt();
                    if (id > 0 && id <= dadosAlunos.size()) {
                        dadosAlunos.remove(id - 1);
                        System.out.println("Aluno removido!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                    
                case 4:
                    System.out.println("A sair... Xauzinho!");
                    break;

                default:
                    System.out.println("Opção inválida, tenta novamente.");
            }
        }
    }
}
