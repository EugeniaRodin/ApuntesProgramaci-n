package ejercicio1;

public class Factorial {
	/*
	 * 1. Ejecuta el programa probando los factoriales de 5,6,7,8,9,10.
	 */
	public static int factorialCola(int n, int acumulador) {
		if (n == 0)
			return acumulador;
		return factorialCola(n - 1, n * acumulador);
	}

	public static void main(String[] args) {

		System.out.println(factorialCola(21, 1)); // 720 } }
		/*
		 * 2. Usando el código original usa el depurador para seguir el flujo de
		 * ejecución del programa (usa la opción “step into” para introducirte en los
		 * métodos). ¿Hay alguna diferencia con la solución anterior?
		 */

	}
}
