package f1;

public class Piloto {
	private int licencia;
	private String nombre;
	private String apellidos;
	private String nacionalidad;
	private Carrera[] carreras;
	
	public Piloto(int licencia, String nombre, String apellidos, String nacionalidad) {
		this.licencia = licencia;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
	}
	
	public Carrera[] getCarreras() {
		return carreras;
	}

	public void setCarreras(Carrera[] carreras) {
		this.carreras = carreras;
	}
	
	public void mostrarDatosPiloto(Piloto piloto) {
		System.out.println(this.licencia);
		System.out.println(this.nombre);
		System.out.println(this.apellidos);
		System.out.println(this.nacionalidad);
		System.out.println(this.carreras);
	}
	
	
	
}
