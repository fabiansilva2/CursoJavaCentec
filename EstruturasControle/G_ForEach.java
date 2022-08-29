package EstruturasControle;

import java.util.Arrays;
import java.util.List;

public class G_ForEach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Jose", "Joao", "Pedro", "Thiago");

		System.out.println("Fazendo com o For");
		for (String nome : aprovados) {
			System.out.println(nome + " - Aprovado 1");
		}

		System.out.println("");

		System.out.println("Fazendo com o ForEach");
		aprovados.forEach((nome) -> {
			System.out.println(nome + " - Aprovado 2");
		});

	}

}
