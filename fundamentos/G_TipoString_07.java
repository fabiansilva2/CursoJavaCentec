package fundamentos;

public class G_TipoString_07 {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(0));// Esta função pega a letra dentro do indice da String;

		String s = "Boa Tarde"; // Não dá pra mudar o valor da String. Uma vez atribuido um valor para a instrig
								// ela fica imutavel. String é um objeto imutavel.
		System.out.println(s.concat(" !!!")); // para juntar palavras, pode fazer dessa forma pelo .concat;
		System.out.println(s + " !!!"); // Ou pode fazer dessa forma pelo +;
		System.out.println(s.startsWith("Boa")); // Para verificar se inicia com a palavra chamada;
		System.out.println(s.startsWith("boa")); // Essa função é case sensitive. Ou seja faz a diferença entre
													// maiusculas e minusculas.
		System.out.println(s.toLowerCase().startsWith("boa"));// Mas se eu fizer com o toLowercase ele desconsidera o
																// case sensitive.
		System.out.println(s.endsWith("tarde")); // endsWith confirma se termina com a palava chamada.
		System.out.println(s.toLowerCase().endsWith("tarde")); // Exemplo com o toLower case.
		System.out.println(s.length()); // Conta a quantidade de caracteres;

		System.out.println(s.equals("Boa Tarde"));// Verifica se a string é igual. é case sensitive.
		System.out.println(s.equalsIgnoreCase("boa tarde")); // Ignora maiusculas e minusculas.
		System.out.println(s.toLowerCase().equals("boa tarde")); // Faz o mesmo resultado equalsIgnoreCase.

		// Só um exemplo de formulario
		var nome = "João";
		var sobrenome = "Pereira";
		var idade = 25;
		var salario = 1200.20;
		System.out.println(
				"\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);

		// Exemplo do mesmo formulario bem melhor organizado
		System.out.printf("\nNome: %s, \nSobrenome: %s, \nIdade: %d, \nSalario: R$ %.2f", nome, sobrenome, idade,
				salario); //print formatado
		// %s para string; %d para inteiro; %f para float, lembrar de colocar quantas
		// casas depois da virgula com o ".2f".

		String frase = String.format("\nNome: %s, \nSobrenome: %s, \nIdade: %d, \nSalario: R$ %.2f", nome, sobrenome,
				idade, salario);
		System.out.println(frase); //também pode colocar dentro desta sintaxe com format.
		
		System.out.println("Frase qualquer".contains("frase")); //forma para ver se contem uma palavra dentro da frase.
		System.out.println("Frase qualquer".toLowerCase().contains("frase")); //Outra forma para ver se contem uma palavra dentro da frase.
		System.out.println("Frase qualquer".indexOf("qual")); //para ver o indice da palavra. Ver em qual posição no indice ela começa.
		System.out.println("Frase qualquer".substring(6, 14)); //imprimir a partir do indice escolhido. no caso ele pega até o numero 13. Pega um antes. Ou seja para no 14.
		
		
		
		
	}

}
