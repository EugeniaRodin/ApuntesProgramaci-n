package ejerciciosColecciones;

import java.util.HashMap;
import java.util.Map.Entry;

public class Contactos {
	
	HashMap<String, Contacto> contactos;

	public Contactos() {
		contactos = new HashMap<String, Contacto>();
	}
	
	public void añadirContacto(String nombre, Contacto contacto) {
		contactos.put(nombre, contacto);
	}
	
	public Contacto obtenerContacto(String nombre) {
		return contactos.get(nombre);
	}
	
	public void mostrarDatos() {
		for(Entry<String, Contacto> e: contactos.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}		
	}
}
