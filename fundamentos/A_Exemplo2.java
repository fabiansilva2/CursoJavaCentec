package fundamentos;

public class A_Exemplo2 {
	public static void main(String[] args) {

		int b = 2; // Variavel declarada com o tipo, nome e valor;
		System.out.println(b);

		var a = 4.5; // Variavel declarada e o java reconhece o tipo automaticamente.
		System.out.println(a);

		a = 12; // Neste caso o java descobre automaticamente que é uma variavel a partir da
				// inferencia.
		System.out.println(a);

		// a = "oi";
		// System.out.println(a); // vai dar erro, pois se já foi declarada na linha 6
		// que é do tipo numerico, não pode colocar outro tipo em baixo. Mesmo que eu
		// ponha o 'var'.

		double d; // Variavel foi declarada.
		d = 6; // Variavel foi inicializada.
		System.out.println(d); // Variavel foi chamada / usada / impressa.

		final int C = 7; // neste caso estou declarando uma constante, ou seja não se pode mudar o valor
							// posteriormente. E por padrão de desenvolvimento deve ser maiuscula.
		System.out.println(C); // Detalhe, uma vez que você declara um valor inteiro, não pode colocar um valor
								// com casas decimais por exemplo. Detalhe para declarar uma constante, é
								// necessario inserir todos os campos. Exemplo: dizer que é uma constante
								// (final), tipo(int, double etc.), o nome da variavel (A, B, C etc.) e o valor.
		
		

	}

}
