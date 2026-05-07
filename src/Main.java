import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		// Adiciona 3 nomes: Joao, Maria, e Pedro
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Pedro");
		// Lista os nomes
		for(String nome : nomes) {
			System.out.println(nome);
		}
		// Corrige o  nomeJoao para João
		nomes.set(0, "João");
		// Elimina o nome Maria
		nomes.remove(1);
		// Volta a listar os nomes
		System.out.println(nomes);
		System.out.println("-------"); // mantém esta linha, é só um separador
		
	}
}