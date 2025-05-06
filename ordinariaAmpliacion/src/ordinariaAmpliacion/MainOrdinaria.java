package ordinariaAmpliacion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class MainOrdinaria {

	public static void main(String[] args) {
		//PEDIDO
		List<Pedido> listaPedidos = Arrays.asList(new Pedido("Cliente1", Arrays.asList("producto1", "producto2"), 526.5), new Pedido("Cliente2", Arrays.asList("producto1", "producto2"), 323),
				new Pedido("Cliente3",  Arrays.asList("producto1", "producto2"), 125));
		
		//Obtener set<String> con todos los productos únicos pedidos por clientes cuyo total supere 100€
		//Set<String> resultado1 = listaPedidos.stream().filter(p -> p.getTotal()>100).flatMap(p -> p.getProductos()).collect(Collectors.toSet());
		
		//Calcular promedio del total de todos los pedidos utililzando referencia a método
		double promedioPedidos = listaPedidos.stream().map(Pedido::getTotal).reduce(0.0, Double::sum);
		
		System.out.println("Promedio de todos los pedidos: "+ promedioPedidos/listaPedidos.size());
		
		//Mostrar el nombre del cliente con el pedido más caro	
		Optional<String> clientePedidoMasCaro = listaPedidos.stream()
				.max(Comparator.comparingDouble(Pedido::getTotal)).map(Pedido::getCliente);

		clientePedidoMasCaro.ifPresent(p -> System.out.println("Cliente con el producto mas caro: " + p));
		
		//Obtener clientes con pedido de más de dos productos
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//ALUMNO
		List<Alumno> listaAlumnos = Arrays.asList(new Alumno("Ana", Optional.of(10), "asignatura1"), new Alumno("Luis", Optional.of(5), "asignatura1"),
				new Alumno("Carlos", Optional.of(6), "asignatura1"), new Alumno("Otro", Optional.ofNullable(null), "asignatura1"), new Alumno("Otro2", Optional.ofNullable(null), "asignatura1"));
	
		//Mostrar Map<String,Double>  clave:asignatura; promedio de notas: valor, ignorando alumnos sin nota
		//Map<String, double> mapaAsignaturas = listaAlumnos.stream().collect(Collectors.groupingBy(Alumno::getAsignatura, Collectors.averagingInt()));
	
		//Mostrar nombre de alumno con nota más alta, referencia a método
		/*Optional<String> alumnoNotaMasaAlta = listaAlumnos.stream()
				.max(Comparator.comparingInt(Alumno::getNota)).map(Alumno::getNombre);

		alumnoNotaMasaAlta.ifPresent(p -> System.out.println("Alumno nota más alta: " + p));*/
		
		//Mostrar lista con los nombres en mayúsculas de los alumnos que tengan nota presente y mayor o igual que 8
		//List<Alumno> listaEj3 = listaAlumnos.stream().filter(p -> p.getNota().ifPresent()&&p.getNota()>8).toList();
		
		//Implementar función recursiva que cuente cuántos alumnos no tienen nota asignada
		Alumno.contarAlumnosSinNota(listaAlumnos, 0, 0);
		
	}

}
