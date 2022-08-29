package EstruturasControle;

import java.util.Scanner;

public class F_While_Desafio {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int quantidadeNotas = 0; // Variavel Qtd de Notas iniciando em 0;
		double nota = 0; // Nota Iniciando em 0;
		double total = 0; // Total iniciando em 0;

		while (quantidadeNotas != 4) { //Enquanto Qtd de notas não for 4;
			System.out.println("Informe a nota:"); // Imprima "Informa a nota";
			nota = entrada.nextDouble(); // E permita a entrada de dados.

			if (nota <= 10 && nota >= 0) { // Se menor que 10 e maior que 0;
				total += nota; // Pegue o total calculado e acrescente a nota;
				quantidadeNotas++; // E pegue a qtde de notas e acrescente +1 ao contador;
			} else if (nota < 0 || nota > 10) { // Se a entrada da nota for menor que 0 e maior que 10;
				System.out.println("Digite uma nota Valida! "); // Imprima "digite uma nota valida";
			}
			double media = total / quantidadeNotas; // Após sair do laço, pegue o total das notas
													// e divida pela quantidade salva no contador.
													// salve a equação na variavel media.
			System.out.println("\nMedia Final: " + media); // imprima a media total.
		}

		entrada.close(); // Feche a entrada de dados.

	}

}
