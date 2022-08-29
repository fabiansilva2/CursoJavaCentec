package fundamentos;

public class E_NotacaoPonto_05 {
	public static void main(String[] args) {


		String s = "bom dia Senhor";
		s = s.toUpperCase(); // transforma todas as letras em maiusculas.
		System.out.println(s);

		s = s.replace("X", "Senhor"); // Substitui a variavel instanciada.
		s = s.toUpperCase(); // Posso colocar esse termo que ele coloca as letras maiusculas.
		s = s.concat("!!!"); // Concatena algum outro termo.
		System.out.println(s);

		System.out.println("José, ".toUpperCase().concat(s)); // Posso colocar todos os 
																//itens dentro do print.

		String x = "ze".toUpperCase(); //Posso colocar instanciando a variavel.
		System.out.println(x);

		String y = "Bom dia, T".replace("T", "Nome!");//Replace serve para substituir 
													//um termo dentro da variavel.
		System.out.println(y);

	}

}
