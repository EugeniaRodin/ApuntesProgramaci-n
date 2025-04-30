package agenda;

import java.util.ArrayList;

public class ListaContactos {
	private ArrayList<Contacto> lista;
	private Contacto contacto;

	public ListaContactos() {
		this.lista = new ArrayList<Contacto>();
	}

	// 1. Alta de contacto
	public void altaContacto(Contacto contacto) {
		this.lista.add(contacto);
	}

	// 2. Baja de contacto (por id)
	public void bajaContacto(int id) {
		if(this.buscarPorId(id)==true) {
			this.lista.remove(contacto);
			System.out.println("Contacto borrado.");
		} else {
			System.out.println("No se puede borrar un contacto que no existe.");
		}
		
	}

	// 3. Modificar teléfono de un contacto (por id)
	/*
	 * public void modificarTlf(int id) { if(id==this.lista.) {
	 * 
	 * } }
	 */

	// 4. Listar todos los datos de los contactos
	public void mostrarDatos() {
		for (Contacto contacto : this.lista) {
			System.out.println(contacto);
		}
	}

	// 5. Mostrar cuántas empresas hay de cada sector

	// 6. Mostrar los datos ordenados por orden alfabético de email

	// Método al que le pasas un id, y devuelve true si existe un contacto de la
	// lista con ese id
	private boolean buscarPorId(int id) {
		boolean encuentraId=false;
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getId()==id) {
				encuentraId=true;
				break;
			}
		}
		return encuentraId;
	}

}
