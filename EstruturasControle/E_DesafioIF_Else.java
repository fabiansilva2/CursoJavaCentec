package EstruturasControle;

import java.util.Scanner;

public class E_DesafioIF_Else {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana");

		String dia = entrada.next();

		if (dia == "domingo") { //não é recomendado fazer dessa forma.
			System.out.println(1);
		}

		if (dia.equalsIgnoreCase("domingo")) { // igualdade de string se resolve o case sensitive com o equals.
			System.out.println(1);
		}

		if ("domingo".equalsIgnoreCase(dia)) { // pode colocar ao contrario tambem.
			System.out.println(1);
		}
		entrada.close();
	}

}
