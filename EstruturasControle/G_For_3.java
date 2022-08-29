package EstruturasControle;

public class G_For_3 {
	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++)
			// variavel inteira tem nome de "i";
			// enquanto variavel "i" for menor ou igual a 10;
			// acrescente de 1 em 1 ao numero/contador.
			System.out.println("i = " + i);

		int a = 0; // se a variavel for declarada fora do laço;
					// pode ser chamada por algum outro metodo fora do escopo;
		for (; a <= 10; a++)
			System.out.println("a = " + a);

		System.out.println("'a' Fora do laco = " + a);

		for (int b = 0; b <= 10; b++)
			for (int c = 0; c <= 10; c++) {
				System.out.printf("[%d %d]\n", b, c);
			}
		System.out.println();

	}

}
