package fundamentos;

public class R_Atribuicao_18 {

	public static void main(String[] args) {
		
		//operadores de atribuição
		int a = 3;
		int b = a;
		int c = a + b;

		c += b; // c = c + b; atribuição aditiva.
		c -= b; // c = c - b; atribuição subtrativa
		c *= b; // c = c * b; atribuição multiplicativa
		c /= b; // c = c / b; atribuição divisiva
		//c %= 2; // c = c % 2; resto da divisão. Atribuição modular.

		System.out.println(c);
	}

}
