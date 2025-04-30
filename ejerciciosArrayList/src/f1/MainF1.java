package f1;

import java.util.Scanner;

public class MainF1 {

	public static void main(String[] args) {
		/*
		 * 1. Alta de piloto (sin datos de los puntos en las carreras) 2. Poner los
		 * puntos de un piloto en todas sus carreras (buscar por id) 3. Añadir puntos de
		 * la última carrera hasta la fecha para un piloto (buscar por id) 4. Listar
		 * todos los datos de los pilotos que tienen como puntuación más baja un 5 en
		 * una carrera. 5. Mostrar número de licencia del piloto con la puntuación total
		 * más alta (en caso de empate basta mostrar un valor) 6. Mostrar los datos
		 * ordenados por orden alfabético de apellidos y nombre 7. Salir
		 */

		Scanner teclado = new Scanner(System.in);
		ListaPilotos listaPilotos = new ListaPilotos(null);
		Piloto pilotoPrueba, pilotoPrueba2;
		pilotoPrueba2 = new Piloto(2, "Piloto2", "Politea", "Pilotolandia");
		listaPilotos.altaPiloto(pilotoPrueba2);
		int opcion;
		String nombre, apellidos, nacionalidad;
		int licencia, puntos=0;
		
		Carrera[] carreras=new Carrera[4];
		for(int i=0; i<carreras.length; i++) {
			carreras[i] = new Carrera(i, puntos);
		}

		System.out.println("¿Qué quieres hacer?");

		// Menu ---------------------------------------------
		System.out.println("\n1. Alta de piloto.");
		System.out.println("2. Poner puntos a las carreras.");
		System.out.println("3. Añadir puntos última carrera.");
		System.out.println("4. Listar\r\n"
				+ "		 * todos los datos de los pilotos que tienen como puntuación más baja un 5 en\r\n"
				+ "		 * una carrera.");
		System.out.println("5. Mostrar número de licencia del piloto con la puntuación total\r\n"
				+ "		 * más alta ");
		System.out.println("6. Mostrar los datos\r\n"
				+ "		 * ordenados por orden alfabético de apellidos y nombre");
		System.out.println("7. Salir.");
		opcion = Integer.parseInt(teclado.nextLine());
		// --------------------------------------------------

		while (opcion != 7) {
			switch (opcion) {
			case 1:
				System.out.println("Introduce num licencia:");
				licencia = Integer.parseInt(teclado.nextLine());
				System.out.println("Nombre:");
				nombre = teclado.nextLine();
				System.out.println("Apellidos:");
				apellidos = teclado.nextLine();
				System.out.println("Nacionalidad:");
				nacionalidad = teclado.nextLine();
				pilotoPrueba = new Piloto(licencia, nombre, apellidos, nacionalidad);
				listaPilotos.altaPiloto(pilotoPrueba);
				break;

			case 2:
				System.out.println("Introduce el id:");
				licencia = Integer.parseInt(teclado.nextLine());
				listaPilotos.ponerPuntosPiloto(licencia);
				break;

			case 3:
				listaPilotos.toString();
				break;
				
			default:
				System.out.println("Escoge una opción correcta.");

			}

			System.out.println("¿Qué quieres hacer?");

			// Menu ---------------------------------------------
			System.out.println("\n1. Alta de piloto.");
		
			opcion = Integer.parseInt(teclado.nextLine());
			// --------------------------------------------------

		}

	}

}
