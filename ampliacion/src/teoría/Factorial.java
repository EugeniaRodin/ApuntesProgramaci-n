package teoría;

public class Factorial {
	
	//PILA
	public static int factorial(int n) {
		if (n == 0)
			return 1;
		//Pila menos eficiente porque tiene que estar guardando el valor de n cada vez
		return n * factorial(n - 1);
	}
	
	//RECURSION DE COLA
	public static int factorialCola(int n, int acumulador) {
		if (n == 0)
			return acumulador;
		// mas eficiente porque llama directamente al metodo
		return factorialCola(n - 1, n * acumulador);
	}

	public static void main(String[] args) {
		System.out.println(factorialCola(21, 1)); // 720 } }
	}
}
