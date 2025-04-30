package ejercicioHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Datos {
	private HashMap<String, String> diccionario;

	public Datos() {
		this.diccionario = new HashMap<>();
	}

	public void añadir(String clave, String valor) {
		this.diccionario.put(clave, valor);
	}

	public boolean borrar(String clave) {
		String valor;
		valor = this.diccionario.remove(clave);
		if (valor != null) {
			return true;
		} else {
			return false;
		}
	}

	public void mostrarDatos() {
		Iterator<Map.Entry<String, String>> iterador; // Map.entry = cada entry = cada elemento
		iterador = this.diccionario.entrySet().iterator(); // entrySet es cada elemento clave-valor del mapa diccionario
		while (iterador.hasNext()) {
			//System.out.println("Clave: " + iterador.next().getKey());
			//System.out.println("Valor: " + iterador.next().getValue());
			String valor=iterador.next().getValue();
			if(valor.startsWith("A")||valor.startsWith("E")) {
				
			}
		}
	}
	
	
	
}
