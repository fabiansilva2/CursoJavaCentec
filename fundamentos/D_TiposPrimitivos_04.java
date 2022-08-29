package fundamentos;

public class D_TiposPrimitivos_04 {

	public static void main(String[] args) {
		byte a = 1; // Ocupa 1 Byte.
		short b = 2; // Ocupa 2 Bytes.
		int c = 4; // Ocupa 4 Bytes.
		long d = 8L; // Ocupa 8 Bytes. Tem que colocar o L Maiusculo no final.

		System.out.println(a + b + c + d);

		float salario = 2000.50F; // Tem que colocar o F maiusculo no final.
		System.out.println(salario);

		boolean ferias = false;
		System.out.println("Esta de ferias? " + ferias);

		char status = 'A';
		System.out.println(status);

	}

}
