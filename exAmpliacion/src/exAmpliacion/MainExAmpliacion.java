package exAmpliacion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainExAmpliacion {

	public static void main(String[] args) {
		// Producto
		List<Producto> listaProductos = Arrays.asList(new Producto("cosa", "categoria1", 1.5, 30),
				new Producto("cosa2", "categoria2", 4, 201), new Producto("cosa3", "categoria2", 15, 2000),
				new Producto("cosa4", "categoria1", 16, 30), new Producto("cosa5", "categoria3", 17, 30));

		// map<categoria,lista> con productos.precio entre 10-20 || ecistencias 200-1000
		Map<String, List<Producto>> resultado = listaProductos.stream()
				.filter(p -> p.getPrecio() > 10 && p.getPrecio() < 20)
				.filter(p -> p.getExistencias() > 200 && p.getExistencias() < 1000)
				.collect(Collectors.groupingBy(Producto::getCategoria));

		// recursión cola:cuantos productos >500 existencias

		// obtener y mostrar producto >precio - referencia metodo
		Optional<Producto> productoMasCaro = listaProductos.stream()
				.max(Comparator.comparingDouble(Producto::getPrecio));

		productoMasCaro.ifPresent(p -> System.out.println("Producto más caro: " + p));

		// det si todos productos tiene existencias
		boolean todosConExistencias = listaProductos.stream().allMatch(p -> p.getExistencias() > 0);

		System.out.println("¿Todos los productos tienen existencias? " + todosConExistencias);

		///////////////////////////////////////////////////////////////////////////////////////
		// Libro
		List<Libro> listaLibros = Arrays.asList(new Libro("titulo1", "autor1", 300, 15),
				new Libro("titulo2", "autor1", 305, 16), new Libro("titulo3", "autor3", 400, 20), new Libro("titulo7", "autor3", 100, 20));

		// lista titulos mas 10 chars o terminan en -a de los mas 300pags, alfabet.
		// Referencia a metodo
		List<String> titulosFiltrados = listaLibros.stream().filter(libro -> libro.getPaginas() > 300)
				.map(Libro::getTitulo).filter(titulo -> titulo.length() > 10)
				.filter(titulo -> titulo.toLowerCase().endsWith("a")).sorted().collect(Collectors.toList());

		titulosFiltrados.forEach(System.out::println);

		// precio total de libros con reduce() y referencia a metodo
		int precioTotal = listaLibros.stream().map(Libro::getPrecio).reduce(0, Integer::sum);
		System.out.println("Precio total de los libros: " + precioTotal);

		// mostrar map<String, double> autro clave promedio precios valor, libros <200
		// pags
		Map<String, Double> promedioPrecioPorAutor = listaLibros.stream().filter(libro -> libro.getPaginas() < 200)
				.collect(Collectors.groupingBy(Libro::getAutor, // clave: autor
						Collectors.averagingDouble(Libro::getPrecio) // valor: promedio de precios
				));

		promedioPrecioPorAutor.forEach(
				(autor, promedio) -> System.out.println("Autor: " + autor + " | Promedio de precio: " + promedio));

		// = apartado 3 pero precio Optional<Integer> en promedio se ignorar libros sin
		// precio
		Optional<Libro> libroMasCaro = listaLibros.stream()
			    .filter(libro -> libro.getPrecio() > 0)  // Ignorar libros sin precio
			    .max(Comparator.comparingInt(Libro::getPrecio));  // Obtener el de mayor precio

		libroMasCaro.ifPresent(l -> System.out.println("Libro más caro: " + l));
	}

}
