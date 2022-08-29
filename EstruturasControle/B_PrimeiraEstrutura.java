package EstruturasControle;

import java.util.Scanner;

public class B_PrimeiraEstrutura {
	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a medida do Raio da Circunferencia: ");
				
		double raio = entrada.nextDouble();
		double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println("A Area da Circunferencia é: " + area);
		
		entrada.close(); 
	}

}
