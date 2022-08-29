package fundamentos;

public class P_DesafioLogicos_16 {
	public static void main(String[] args) {
		boolean conseguiuDinheiro = true;
		boolean conseguiuDesconto = true;

		boolean comprouTV = conseguiuDinheiro && conseguiuDesconto;
		boolean comprouTV1 = conseguiuDinheiro ^ conseguiuDesconto;
		boolean comprouTV2 = conseguiuDinheiro || conseguiuDesconto;
		boolean gastouNada = conseguiuDinheiro || conseguiuDesconto;

		boolean descontoMaior = !gastouNada;
		boolean descontoMaior2 = !!gastouNada;

		System.out.println("Comprou TV? " + comprouTV);
		System.out.println("Comprou TV? " + comprouTV1);
		System.out.println("Comprou TV? " + comprouTV2);

		// operador Unario!
		System.out.println("Comprou Nada? " + descontoMaior);
		System.out.println("Comprou Nada? " + descontoMaior2 + ", Se eu não comprar nada o desconto é maior!");

	}

}
