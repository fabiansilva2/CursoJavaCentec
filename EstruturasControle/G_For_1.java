package EstruturasControle;

public class G_For_1 {
	public static void main(String[] args) {
//		int contador = 1; 
//		while (contador <= 10) { 
//			System.out.println("bom dia"); 
//			contador++; 

		// Faz a mesma coisa do while só que com menos codigo.
		for (int contador = 1; contador <= 10; contador++) {
		// for (int contador = 2; contador <= 20; contador+=2) {
		// Incrementar de 2 em 2.
			System.out.println("i = " + contador);

			//Também pode ser imprimido desta forma
			//System.out.printf("i = %d\n", contador);
			//Lembrando que se eu tirar o contador ele ficará repetindo infinitamente.
		
			// Laço infinito	
			// for (;;) {
			// System.out.println("Fim");
			//}
			// Laço infinito	
			// for (;true;) { // Se colocar o false ele nem entra no laço
			// System.out.println("Fim");
			//} 
			// for (..;..;..)(Inicialização da Variavel; Expressão; Modificação da Variavel);

		}

	}

}
