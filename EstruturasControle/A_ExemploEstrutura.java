package EstruturasControle;

import java.util.Scanner; // o Scanner colocar automaticamente o import

public class A_ExemploEstrutura {

	public static void main(String[] args) { // metodo de entrada do programa
		Scanner entrada = new Scanner(System.in); // O Scanner serve para ler o que será escrito no console.

		System.out.println("Digite seu nome: "); // Imprime no console a frase ou instrução ao usuario.
		String nome = entrada.nextLine(); // Em baixo coloca o tipo de dado que será dado entrada.
											// Posteriormente este dado será exibido no console.

		System.out.println("Ola " + nome + "!!!"); // Serve para imprimir o resultado da sentença.

		entrada.close(); // O Close serve para fechar o scanner. Se não fizer ele vai dar erro e vai
							// continuar procurando e consumir espaço de memoria.
	}

}
