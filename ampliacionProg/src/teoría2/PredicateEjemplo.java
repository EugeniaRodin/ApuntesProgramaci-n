package teoría2;


import java.util.function.Predicate;

public class PredicateEjemplo {
	public static void main(String[] args) {        
		Predicate<Integer> esPar = num -> num % 2 == 0;    
		Predicate<Integer> esImpar = num -> num % 2 != 0; 
		Predicate<Integer> esImpar2 = esPar.negate(); 
		System.out.println(esPar.test(10)); // true        
		System.out.println(esPar.test(7));  // false
		System.out.println(esImpar.test(17));
		System.out.println(esImpar2.test(23));
	}
}
