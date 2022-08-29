package EstruturasControle;

public class J_Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}

		for (int i = 0; i <= 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);

		}
	}

}


// Enquanto o Brake é usado para sair do laço atual.
// O Continue só interrompe o laço e depois segue/continua.