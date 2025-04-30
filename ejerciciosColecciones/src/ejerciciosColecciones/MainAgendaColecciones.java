package ejerciciosColecciones;

import java.util.HashMap;
import java.util.Scanner;

public class MainAgendaColecciones {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Contactos contactos;
		double masa;
		
		contactos = new Contactos();
		
		masa=Double.parseDouble(teclado.nextLine());
		Contacto contacto = new Contacto("Pedro", 3.2, 4.5, "Empresa");
		String nombre = null;
		contactos.añadirContacto(nombre, contacto);
	}

}
