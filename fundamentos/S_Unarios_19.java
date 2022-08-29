package fundamentos;

public class S_Unarios_19 {
	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		a++; // a = a + 1; // incrementa 1
		a--; // a = a - 1; // decrementa 1

		++b; // b = b + 1;
		--b; // b = b - 1;

		System.out.println(a);
		System.out.println(b);

		System.out.println(++a == b--);
		System.out.println(a == b);
		
	}

}
