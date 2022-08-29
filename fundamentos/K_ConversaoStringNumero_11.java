package fundamentos;

import javax.swing.JOptionPane;

public class K_ConversaoStringNumero_11 {
	public static void main(String[] args) {

		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		// Selecionar o java Desktop nas opções.
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

		System.out.println(valor1 + valor2); //aqui ele vai concatenar.

		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);

		double soma = numero1 + numero2; // aqui ele vai fazer os calculos.
		System.out.println("soma: " + soma);
		System.out.println("media " + soma / 2);

	}

}
