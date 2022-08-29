package fundamentos;

public class I_ConversaoTiposPrimitivos_09 {
	public static void main(String[] args) {
		double a = 1; // Conversão implicita;
		System.out.println(a);

		float b = (float) 1.123456; // Conversão explicita (CAST);
		System.out.println(b);

		int c = 2; // byte de -128 a +127. (CAST)
					// se colocar o valor de 128 para cima ele retorno o valor negativo.
		byte d = (byte) c;
		System.out.println(d);

		double e = 1.66666;
		int f = (int) e; //Esse CAST só retorna o valo inteiro, ignora o valor depois da virgula.
		System.out.println(f);
		

	}

}
