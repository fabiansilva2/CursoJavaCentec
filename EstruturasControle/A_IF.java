package EstruturasControle;

import java.util.Scanner;

public class A_IF {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a media: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabens!!!");
		}

		if (media < 7 && media >= 4.5) {
			System.out.println("Em Recuperação");
			System.out.println("Estude Mais!!!");
		}

		if (media < 4.5 && media >= 0) {
			System.out.println("Reprovado");
		}

		// Para o mesmo resultado o codigo pode ser escrito dessa forma, quebrando em
		// variaveis.
		// boolean criterioAprovacao = media < 4.5 && media >= 0;
		// if (criterioAprovacao) {
		// System.out.println("Reprovado");
		// }

		entrada.close();
	}

}
