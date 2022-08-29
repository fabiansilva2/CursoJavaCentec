package fundamentos;

public class M_Aritmeticos_13 {

	public static void main(String[] args) {

		// formas de usar os operadores aritimeticos.
		var x = 3;
		var y = 2;
		System.out.println(x + y); // soma
		System.out.println(x - y); // subtração
		System.out.println(x * y); // multiplicação
		System.out.println(x / y); // divisão
		System.out.println(x % y); // resto da divisão
		
		System.out.println(x + y - x * y); //Observar ordem de precedencia.
		System.out.println(" ");

		System.out.println(3 + 2);
		System.out.println(3 - 2);
		System.out.println(3 * 2);
		System.out.println(3 / 2);
		System.out.println(3 % 2);
		System.out.println(3 % (double) 2); // exmplo de CAST
	}

}
