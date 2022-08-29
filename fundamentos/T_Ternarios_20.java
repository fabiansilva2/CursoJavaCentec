package fundamentos;

public class T_Ternarios_20 {
	public static void main(String[] args) {

		// Operador Ternario serve para comparar entre dois valores e apresentar o resultado em duas condições;
		double media = 4.6;
		String resultadoRecuperacao = media >= 5.0 ? "Em recuperação" : "reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : resultadoRecuperacao;
		System.out.println("O aluno está " + resultado);
		
		double nota = 7.3;
		boolean bomComportamento = true; //conta com boolean.
		boolean passouMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouMedia;
		String resultadoFinal = temDesconto ? "Sim" : "Não"; // A Interrogação funciona como a funcão "SE";
		
		System.out.println("Tem desconto? " + resultadoFinal);
	}

}
