package ejerciciosColecciones;

public class Contacto {
	private String nombre;
	private double masa;
	private double distancia;
	private String tipo;
	
	public Contacto(String nombre, double masa, double distancia, String tipo) {
		this.nombre = nombre;
		this.masa = masa;
		this.distancia = distancia;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
