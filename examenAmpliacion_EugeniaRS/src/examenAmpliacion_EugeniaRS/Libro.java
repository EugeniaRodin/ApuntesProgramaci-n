package examenAmpliacion_EugeniaRS;

public class Libro {
	private String titulo;
	private String autor;
	private double paginas;
	private int precio;
	
	
	public Libro(String titulo, String autor, double paginas, int precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.precio = precio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPaginas() {
		return paginas;
	}
	public void setPaginas(double paginas) {
		this.paginas = paginas;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", precio=" + precio + "]";
	}
	
	
}
