package fundamentos;

public class J_ConversaoNumeroString_10 {
	public static void main(String[] args) {
		Integer num1 = 1000; // Converte para string e depois conta quantos carcteres tem;
		System.out.println(num1.toString().length());

		int num2 = 10000; // outra forma de converter para string e contar os carcteres.
		System.out.println(Integer.toString(num2).length());
		//Tambem tem para double, float e outros tipos primitivos.		
		
	}

}
