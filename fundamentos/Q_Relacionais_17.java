package fundamentos;

public class Q_Relacionais_17 {
	public static void main(String[] args) {

		// operadores relacionais
		System.out.println(3 > 4); // maior
		System.out.println(3 >= 4); // maior ou igual
		System.out.println(3 < 4); // menor
		System.out.println(3 <= 4); // menor ou igual
		System.out.println(3 != 4); // Diferente
		System.out.println(3 == 4); // Igual
		// System.out.println(3 === 4); // Igual e do mesmo tipo em algumas linguagens.
		// Sinal de = é para dizer que uma variavel recebe um valor.

		double nota = 7.3;
		boolean bomComportamento = true; // conta com boolean.
		boolean media = nota >= 7;
		boolean temDesconto = bomComportamento && media;
		System.out.println("Tem desconto? " + temDesconto);

	}

}
