package examenAmpliacion_EugeniaRS;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MainExamen {

	public static void main(String[] args) {
		//Producto
		List<Producto> listaProductos = Arrays.asList(new Producto("cosa", "categoria1", 1.5, 30), new Producto("cosa2", "categoria2", 4, 201),
				new Producto("cosa3", "categoria2", 15, 2000),new Producto("cosa4", "categoria1", 16, 30),new Producto("cosa5", "categoria3", 17, 30));
		
		
		//map<categoria,lista> con productos.precio entre 10-20 || ecistencias 200-1000
		
		//recursión cola:cuantos productos >500 existencias
		
		
		//obtener y mostrar producto >precio - referencia metodo 
		listaProductos.stream()
		.sorted((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()))
		.forEach(System.out::println);
		
		
		/*Function<List, Producto> mayorPrecio = str -> str.ge);
		System.out.println(longitud.apply("Java")); // 4*/
		
		
		//det si todos productos tiene existencias
		
		
		///////////////////////////////////////////////////////////////////////////////////////
		//Libro
		List<Libro> listaLibros = Arrays.asList(new Libro("titulo1", "autor1", 300, 15), new Libro("titulo2", "autor1", 305, 16),
				new Libro("titulo3", "autor3", 400, 20));
		
		//lista titulos mas 10 chars o terminan en -a de los mas 300pags, alfabet. Referencia a metodo
		
		//precio total de libros con reduce() y referencia a metodo
		
		
		//mostrar map<String, double> autro clave promedio precios valor, libros <200 pags
		
		//= apartado 3 pero precio Optional<Integer> en promedio se ignorar libros sin precio

	}

}
