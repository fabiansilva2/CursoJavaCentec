package EstruturasControle;

public class F_While_1 {
	public static void main(String[] args) {
		int contador = 1; // Contador recebe o valor 1;
		while (contador <= 10) {
			// Enquanto contador for menor que 10.
			System.out.println("bom dia"); // imprima bom dia.
			contador++; // incremente de 1 em 1 à variavel contador.                                // Se eu tirar essa linha ele vai 
												                                 // repetir infinitamente porque não tem incremento.
			int contador2 = 1;
			while (contador2 <= 10) {
				System.out.printf("i = %d\n", contador2);
				contador2++;
				 //%d é para informar que é inteiro. 
				//\n faz uma quebra de linha.
			}
		}
	}
}

// printf é para imprimir um valor formatado

// **Especificadores de formato**
// %d representa números inteiros
// %f representa números floats
// %2f representa números doubles
// %b representa valores booleanos
// %c representa valores char

// **Caracteres de Escape**
// \n	Nova linha. Posiciona o cursor de tela no início da próxima linha
// \t	Tabulação horizontal. Move o cursor de tela para a próxima parada de tabulação.
// \r	Posiciona o cursor da tela no início da linha atual - não avança para a próxima linha. Qualquer saída de caracteres gerada depois de algum retorno já gerado é sobrescrito os caracteres anteriores gerados na linha atual.
// \\Barras invertidas. Utilizada para imprimir um caractere de barra invertida.
// \”	Aspas duplas. Utilizada para imprimir um caractere de aspas duplas. Exemplo, System.out.println(“\”aspas\””); exibe “aspas”