package fundamentos;

import java.util.Scanner;

public class L_DesafioConversao_12 { // calcular media de três valores
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); //sempre colocar o scanner.
			//Nessa sentença o nome Scanner pode ser substituido por qualquer nome.
			//no caso somente o primeiro Scanner, o que vai definir que é um scanner é a sentença "new Scanner".
		
		System.out.print("Informe o primeiro salario: ");
		String valor1 = entrada.next().replace(",", "."); // Vai subsituir a virgula pelo ponto.

		System.out.print("Informe o segundo salario: ");
		String valor2 = entrada.next().replace(",", "."); //O "entrada.next" que faz o input dos valores.

		System.out.print("Informe o terceiro salario: ");
		String valor3 = entrada.next().replace(",", ".");

		double salario1 = Double.parseDouble(valor1); //informa que os valores inseridos serão do tipo double.
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);

		double media = (salario1 + salario2 + salario3) / 3; //faz o calculo da media

		System.out.println("A media dos salarios é: " + media); //imprime no console.

		entrada.close(); //fecha a sentença.
	}

}
