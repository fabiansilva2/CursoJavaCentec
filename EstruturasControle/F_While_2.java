package EstruturasControle;

import java.util.Scanner;

public class F_While_2 {
	public static void main(String[] args) {
		System.out.println("***Editor de Texto***"); // Titulo
		Scanner entrada = new Scanner(System.in); // Scanner

		String palavras = ""; // Criado uma variavel do tipo
								// String para armazenar o Scanner
		while (!palavras.equalsIgnoreCase("sair")) {
			// Enquanto a palavra sair não for
			// armazenada na variavel palavras.
			System.out.println("Digite Alguma Coisa: ");
			palavras = entrada.nextLine();
			// Permita a entrada de dados para armazenar na variavel palavras.
		}

		System.out.println("*Voce Saiu do Editor*");
		// Print fora do laço para informar que o usuario saiu do editor.

		entrada.close();
	}

}
