package f1;

public class Carrera {
	private int id;
	private int puntos;
	
	public Carrera(int id, int puntos) {
		this.id = id;
		this.puntos = puntos;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}
