package ejercicios;

public class Ejercicio {
	//1.Calcular la suma de los primeros n números naturales.
	public static int imprimirSumNums(int n) {
		if(n==0) {
			return 0;
		}
		return n + imprimirSumNums(n-1);
	}
	
	//2.Contar la cantidad de dígitos en un número entero positivo.
	public static int contarNumDig(int n) {
		if(n>=0&n<10) {
			return 1;
		} 		
		return 1+contarNumDig(n/10);
	}
	
	//3.Invertir una cadena de texto.
	public static String invertirCadena(String cadena) {
		if(cadena.length()==1) {		
			return cadena;
		}
		
		//return cadena.charAt(cadena.length()-1)+invertirCadena(cadena);
		return cadena.charAt(cadena.length()-1)+invertirCadena(cadena);
	}
	
	//4.Calcular la potencia de un número (base^exponente).
	public static int calcularPotencia(int base, int exponente) {
		if(exponente==0) {
			return 1;
		}
		return calcularPotencia(base, exponente);
	}
	
	//////////////////////////// MAIN //////////////////////////////////
	public static void main(String[] args) {
		System.out.println(Ejercicio.imprimirSumNums(5));
		System.out.println(Ejercicio.contarNumDig(85452));
		System.out.println(Ejercicio.invertirCadena("ab"));
	}
}
