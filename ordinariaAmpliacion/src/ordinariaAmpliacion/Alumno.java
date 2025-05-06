package ordinariaAmpliacion;

import java.util.List;
import java.util.Optional;

public class Alumno {
	private String nombre;
	private Optional<Integer> nota;
	private String asignatura;

	public Alumno(String nombre, Optional<Integer> nota, String asignatura) {
		this.nombre = nombre;
		this.nota = nota;
		this.asignatura = asignatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Optional<Integer> getNota() {
		return nota;
	}

	public void setNota(Optional<Integer> nota) {
		this.nota = nota;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Alumno [cliente=" + nombre + ", nota=" + nota + ", asignatura=" + asignatura + "]";
	}

	public static int contarAlumnosSinNota(List<Alumno> lista, int i, int contador) {
		if(i >= lista.size()) {
			return contador;
		} else {
			if(lista.get(i).getNota().isEmpty()) {
				contador=contador+1;
			} 
		}
		
		return contarAlumnosSinNota(lista, i+1, contador);
	}
}
