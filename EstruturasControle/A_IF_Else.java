package EstruturasControle;

import java.util.Scanner;

public class A_IF_Else {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sinal Esta Aberto? (1) para SIM | (2) para NAO: ");
		Integer sinal = entrada.nextInt();
		if  (sinal == 1){
			System.out.println("Siga!");
		} else if (sinal == 2){
			System.out.println("Pare!");
		}
		
		entrada.close();
				
		
		/*Scanner entrada = new Scanner(System.in);
	System.out.println("Você Quer fazer isso? (1) para SIM | (Qualquer outro numero) para NAO: ");
		Integer sinal = entrada.nextInt();
		if  (sinal == 1){
			System.out.println("Sim!");
		} else {
			System.out.println("Nao!");
		}
		
		entrada.close();*/ //outra forma de fazer o if else.
	}

}
