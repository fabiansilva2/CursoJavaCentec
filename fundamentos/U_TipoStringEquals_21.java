package fundamentos;

import java.util.Scanner;

public class U_TipoStringEquals_21 {
	public static void main(String[] args) {
		System.out.println("2" == "2");

		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));

		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next(); // next retira os espaços em branco. O nextLine não retira os espaços em branco.
		System.out.println("2" == s2.trim()); // o trim retira os espaços em branco.
		System.out.println(s2); 
		System.out.println("2".equals(s2.trim()));

		entrada.close();

	}

}
