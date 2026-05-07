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
	ArrayList<String> dadosAlunos = new ArrayList<>();
	Scanner leitor = new Scanner(System.in);
	int opcao = 0;
	
	public static void main(String[] args) {
		
		while (opcao != 4) {
            System.out.println("\n--- TODO LIST ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Ver tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();
            leitor.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno a adicionar: ");
                    String nomeAluno = leitor.nextLine();
                    dadosAlunos.add(nomeAluno, numAluno);
                    System.out.println("Aluno adicionado!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Alunos ---");
                    if (dadosAlunos.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for(String nomeAluno : dadosAlunos) {
                        	System.out.println(nomeAluno);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Número da tarefa a remover: ");
                    int id = leitor.nextInt();
                    if (id >= 0 && id < dadosAlunos.size()) {
                       dadosAlunos.remove(id-1);
                        System.out.println("Tarefa removida!");
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
