package fundamentos;

import java.util.Scanner;

public class H_Console_08 {
	public static void main(String[] args) {
		System.out.print("");
		System.out.printf("numeros: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		// para fazer isso tem que fazer o printf. O java não aceito o println.
		// para quebrar a linha posso usar o \n ou %n.

		Scanner entrada = new Scanner(System.in); //O Scanner serve para ler o que foi escrito no console.

		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();// Esse termo é usado para abrir um espaço para digital no console.

		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine(); //nextLine serve para digitar uma string.
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt(); //nextInt serve para ler numero inteiro.
		
		System.out.print("Digite sua renda: ");
		double renda = entrada.nextDouble(); //nextDouble serve para ler numeros com ponto flutuante.
		
		System.out.println("\nNome = " + nome + " " + sobrenome + "\nidade: " + idade +"\nRenda: " + renda); // Ele imprime no console o que foi escrito.
		System.out.printf("%s %s tem %d anos e tem renda de R$ %.2f reais", nome, sobrenome, idade, renda); //outra forma de imprimir.
		
		entrada.close(); // Lembrar de fechar a entrada.
		

	}

}
