package EstruturasControle;

import java.util.Scanner;

public class C_DesafioIf {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a nota do aluno: ");
		int nota = entrada.nextInt();
		
		if ((nota >= 7) && (nota <= 10)) {
			System.out.println("Aprovado");
		} if ((nota < 7) && (nota >= 4)) {
			System.out.println("Recuperacao");
		} if ((nota < 4) && (nota >= 0)) {
			System.out.println("Reprovado");
		} else if((nota > 10) || (nota < 0)) {
			System.out.println("Nota Invalida");
		}
		entrada.close(); 
	}

}

//Não usar ponto e virgula nas estruturas de controle.
//Não consigo atribuir um double negativo.
//Não consegui fechar o else if só com else no final.
