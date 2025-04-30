package ejercicios2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ejercicio {
	public static void main(String[] args) {
		//Con Supplier: 1. Generar un número aleatorio usando 
		Supplier<Double> numAleatorio = () -> Math.random()*10;
		System.out.println(numAleatorio.get());
		
		//2. Obtener la fecha actual en formato LocalDate usando Supplier<LocalDate>. 
		Supplier<LocalDate> fechaActual = () -> LocalDate.now();
		System.out.println(fechaActual.get());
		
		//3. Generar un saludo aleatorio de una lista usando Supplier<String>. 
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Holi");
		lista.add("Hola");
		lista.add("Hello");
		lista.add("Priviet");
		lista.add("Hi");
		Supplier<String> saludoRandom = () -> lista.get((int)(Math.random()*lista.size()));
		System.out.println(saludoRandom.get());
		
		//4. Devolver un nombre por defecto usando Supplier<String>. 
		Supplier<String> nombreDefecto = () -> "tuNombre";
		System.out.println(nombreDefecto.get());
		
		//5. Producir un identificador único usando Supplier<UUID>.
		Supplier<UUID> uniqueID = () -> UUID.randomUUID();
		System.out.println(uniqueID.get());
		
		//Con UnaryOperator
		//6. Multiplicar por 7 un número usando UnaryOperator<Integer>. 
		UnaryOperator<Integer> mult7 = x -> x*7;
		System.out.println(mult7.apply(7));
		
		//7. Duplicar una cadena usando UnaryOperator<String>. 
		UnaryOperator<String> duplicarString = str -> str + str;
		System.out.println(duplicarString.apply("casa"));
		
		//8. Incrementar un número en 5 usando UnaryOperator<Integer>. 
		UnaryOperator<Integer> plus5 = x -> x + 5;
		System.out.println(plus5.apply(5));
		
		
		//9. Reemplazar comas en una cadena por comillas dobles usando UnaryOperator<String>. 
		
		
		//10. Invertir el signo de un número usando UnaryOperator<Double>.
		
		
	}
}
