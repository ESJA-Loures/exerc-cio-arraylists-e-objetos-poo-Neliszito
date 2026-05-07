import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- TODO LIST ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Ver tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção e limpa o buffer do teclado
            opcao = leitor.nextInt();
            leitor.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome da tarefa a adicionar: ");
                    String nomeTarefa = leitor.nextLine();
                    System.out.println("Tarefa adicionada!");
                    tarefas.add(nomeTarefa);
                    break;

                case 2:
                    System.out.println("\n--- Lista de Tarefas ---");
                    if (tarefas.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for(String tarefa : tarefas) {
                        	System.out.println(tarefa);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Número da tarefa a remover: ");
                    int id = leitor.nextInt();
                    if (id >= 0 && id < tarefas.size()) {
                       tarefas.remove(id-1);
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
        leitor.close();
    }
}