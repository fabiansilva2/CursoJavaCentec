package fundamentos;

public class B_Temperatura_02 {
	public static void main(String[] args) {

		final double FATOR = 5.0 / 9.0; // Graus Celcius
		final double AJUSTE = 32; // Farenheit

		double fahrenheit = 86;
		double celcius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado e " + celcius + "°C");

		fahrenheit = 150 ;
		celcius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado e " + celcius + "°C");
	}

}
