package EstruturasControle;

public class G_For_4 {
	public static void main(String[] args) {
		// Laco for com String
		for (String v = "#"; !v.equals("######"); v += "#") {
			// a variavel #, enquando não for ###### (com seis caracteres), acrescente um #.
			System.out.println(v);
		}

		// laço for com numero
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
	}

}
