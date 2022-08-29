package fundamentos;

public class O_Logicos_15 {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;

		System.out.println(condicao1 && !condicao2); //E
		System.out.println(condicao1 || condicao2); //OU
		System.out.println(condicao1 ^ condicao2); //XOR EXCLUSIVO
		System.out.println(!!condicao1); //DUPLO NAO
		System.out.println(!condicao1); //NAO

		System.out.println("Tabela Verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);

		System.out.println("Tabela Verdade OU (OR)");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("Tabela Verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		System.out.println("Tabela Verdade NÃO (NOT)");
		System.out.println(!true);
		System.out.println(!false);

	}

}
