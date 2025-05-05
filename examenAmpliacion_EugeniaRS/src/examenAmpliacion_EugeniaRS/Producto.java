package examenAmpliacion_EugeniaRS;

import java.util.List;

public class Producto {
	private String nombre;
	private String categoria;
	private double precio;
	private int existencias;
	
	public Producto(String nombre, String categoria, double precio, int existencias) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.existencias = existencias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", existencias="
				+ existencias + "]";
	}
	
	
}
