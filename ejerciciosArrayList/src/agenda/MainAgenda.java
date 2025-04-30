package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAgenda {

	public static void main(String[] args) {
		
		/*
		 * 1. Alta de contacto
		 * 2. Baja de contacto (por id)
		 * 3. Modificar teléfono de un contacto (por id)
		 * 4. Listar todos los datos de los contactos
		 * 5. Mostrar cuántas empresas hay de cada sector
		 * 6. Mostrar los datos ordenados por orden alfabético de email
		 * 7. Salir
		 * 
		 */
		
		Scanner teclado = new Scanner(System.in);
		int opcion, id;
		Contacto contacto = null;
		Persona persona;
		Empresa empresa;
		String nombre, apellidos, telefono, email, sector, direccionPostal,tipo;
		ListaContactos agenda;
		
		System.out.println("¿Qué quieres hacer?");

		// Menu ---------------------------------------------
		System.out.println("\n1. Alta de contacto");
		System.out.println("2. Baja de contacto");
		System.out.println("3. Modificar teléfono de un contacto");
		System.out.println("4. Listar todos los datos de los contactos");
		System.out.println("5. Mostrar cuántas empresas hay de cada sector");
		System.out.println("6. Mostrar los datos ordenados por orden alfabético de email");
		System.out.println("7. Salir.");
		opcion = Integer.parseInt(teclado.nextLine());
		agenda = new ListaContactos();
		// -------------------------------------------------
		
		while(opcion!=7) {
			switch (opcion) {
			case 1: 
				System.out.println("Id:");
				id=Integer.parseInt(teclado.nextLine());
				System.out.println("Telefono:");
				telefono=teclado.nextLine();
				System.out.println("Email:");
				email=teclado.nextLine();
				System.out.println("TIpo:");
				tipo = teclado.nextLine();
				if(tipo.equals("1")) {
					System.out.println("Nombre:");
					nombre=teclado.nextLine();
					System.out.println("Apellidos:");
					apellidos=teclado.nextLine();
					persona= new Persona(nombre, apellidos);
					empresa= null;
				} else {
					System.out.println("Sector:");
					sector=teclado.nextLine();
					System.out.println("Direccion:");
					direccionPostal=teclado.nextLine();
					empresa= new Empresa(sector, direccionPostal);
					persona=null;
				}
				contacto=new Contacto(id, telefono, email, persona, empresa);
				agenda.altaContacto(contacto);
				break;	
			
			case 2: 
			
			
			break;
			
			case 3:
			
			break;
			
			case 4: 
			agenda.mostrarDatos();
				break;
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			
			System.out.println("\n1. Alta de contacto");
			System.out.println("2. Baja de contacto");
			System.out.println("3. Modificar teléfono de un contacto");
			System.out.println("4. Listar todos los datos de los contactos");
			System.out.println("5. Mostrar cuántas empresas hay de cada sector");
			System.out.println("6. Mostrar los datos ordenados por orden alfabético de email");
			System.out.println("7. Salir.");
			opcion = Integer.parseInt(teclado.nextLine());
		}
		
	}

}
