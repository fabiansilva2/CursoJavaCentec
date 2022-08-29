package fundamentos;

import java.util.Scanner;

public class Z_DesafioCalculadora_22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um numero: ");
		double num1 = entrada.nextDouble();

		System.out.println("informe outro numero: ");
		double num2 = entrada.nextDouble();

		System.out.println("Informe um operador: ");
		String op = entrada.next();

		double 
		resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;

		System.out.println("O Resultado é: " +resultado);

		entrada.close();
	}

}
