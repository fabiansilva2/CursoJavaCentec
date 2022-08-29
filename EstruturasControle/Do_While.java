package EstruturasControle;

import java.util.Scanner;

public class Do_While {
	public static void main(String[] args) {

		// A Diferenca para o While é que ele vai executar pelo menos uma vez.
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		do {
			System.out.println("Voce precisa escrever alguma coisa: ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("sair"));

		System.out.println("voce saiu");
		entrada.close();
	}

}
