package aTeoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Apuntes {

	/*
	 * LAMBDA () -> sentencia parametro -> {sentencia;}; (parametro,parametro2) ->
	 * {sentencia;}; (parametro) -> {sentencia1; sentencia2}
	 */

	@FunctionalInterface
	public interface Interfaz {
		public void escribirMensaje();
	}

	public static void main(String[] args) {
		Interfaz interfaz = () -> {
			System.out.println("loquesea");
		};
		interfaz.escribirMensaje();

		// Predicate<T> -> recibe un argumento y devuelve un boolean. Filtrar
		// .test
		Predicate<Integer> esPar = num -> num % 2 == 0;
		System.out.println(esPar.test(10)); // true

		// Function<T,R> -> Genera un resultado R a partir de una entrada de tipo T.
		// .apply
		Function<String, Integer> longitud = str -> str.length();
		System.out.println(longitud.apply("Java")); // 4

		// Consumer<T> -> recibe un argumento y no devuelve nada.
		// .accept
		Consumer<String> imprimir = mensaje -> System.out.println("Mensaje: " + mensaje);
		imprimir.accept("Hola"); // Hola, mundo

		// Supplier<T> -> resultado de tipo T. No argumentos.
		// .get
		Supplier<String> mensajeSupplier = () -> "Hola, bienvenido";
		// Llamamos a get() para obtener el valor
		System.out.println(mensajeSupplier.get());

		// UnaryOperator<T> -> tipo de entrada y de salidason el mismo.
		// .apply
		UnaryOperator<Integer> cuadrado = x -> x * x;
		System.out.println(cuadrado.apply(5)); // 25

		/////////////////////////////////////////////////////////////
		/////////////////// REFERENCIAS A METODOS ///////////////////

		List<String> nombres = Arrays.asList("Ana", "Pedro", "Juan", "Carlos");

		// Referencia a un método estático
		Function<Integer, String> convertirAString = String::valueOf;
		System.out.println("Número convertido: " + convertirAString.apply(123)); // "123"

		// Referencia a un constructor
		Supplier<List<String>> nuevaLista = ArrayList::new;
		List<String> listaVacia = nuevaLista.get();
		System.out.println("Lista creada: " + listaVacia);

		/*
		 * // Referencia a un método de instancia (en un objeto específico)
		 * ReferenciasAMetodos obj = new ReferenciasAMetodos(); UnaryOperator<String>
		 * aMayusculas = obj::convertirMayusculas; System.out.println("Mayúsculas: " +
		 * aMayusculas.apply("hola")); // "HOLA"
		 */

		// Uso de referencia a métodos en lugar de expresiones lambda
		nombres.forEach(System.out::println); // Imprime cada nombre en la lista

		/////////////////////////////////////////////////////////////
		///////////////////////// OPTIONAL //////////////////////////
		Optional<String> nombre = Optional.ofNullable(null); // Puede contener un valor o estar vacío
		// orElse(): Devuelve el valor o un valor por defecto
		System.out.println(nombre.orElse("Desconocido"));
		// orElseGet(): Devuelve un valor usando un Supplier
		System.out.println(nombre.orElseGet(() -> "Valor generado"));
		// orElseThrow(): Lanza una excepción si está vacío
		try {
			System.out.println(nombre.orElseThrow(() -> new RuntimeException("No hay nombre")));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// isPresent(): Verifica si hay un valor
		System.out.println("¿Hay un nombre? " + nombre.isPresent());
		// ifPresent(): Ejecuta una acción si el valor está presente
		nombre.ifPresent(n -> System.out.println("Nombre: " + n));

		/////////////////////////////////////////////////////////////
		////////////////////////// STREAMS //////////////////////////

		// filter, map, flatMap, distinct, limit, skip, forEach, reduce, count,
		// findFirst,
		// findAny, anyMatch, allMatch, noneMatch, collect

		List<Integer> numeros = Arrays.asList(5, 2, 9, 1, 3);
		numeros.stream().sorted().forEach(System.out::println);

		List<Persona> personas = Arrays.asList(new Persona("Ana", 30), new Persona("Luis", 25),
				new Persona("Carlos", 35));

		personas.stream()
			.sorted((p1, p2) -> Integer.compare(p1.edad, p2.edad))
			.forEach(System.out::println);
		
		//ordenar ojetos por atributo
		personas.stream()
		.sorted((p1, p2) -> Integer.compare(p1.edad, p2.edad))
		.forEach(System.out::println);
		
		//Numeros orden descendente
		List<Integer> numeros = Arrays.asList(4, 1, 9, 2, 7);
		numeros.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
		//objetos ordenados por edad descendente
		personas.stream()
		.sorted(Comparator.comparingInt((Persona p) -> p.edad).reversed())
		.forEach(System.out::println);
		
		//conversion
		List<String> nombres = Arrays.asList("Ana", "Luis", "Alberto", "Lucía");
		List<String> nombresConL = nombres.stream()
		.filter(nombre -> nombre.startsWith("L"))
		.collect(Collectors.toList());
		System.out.println(nombresConL);
		
		//toArray
		String[] nombres = {"Ana", "Luis", "Alberto", "Lucía"};
		String[] resultado = Arrays.stream(nombres)
		.filter(nombre -> nombre.length() > 4)
		.toArray(String[]::new);
		System.out.println(Arrays.toString(resultado)); // [Alberto, Lucía]
		
	}

}
