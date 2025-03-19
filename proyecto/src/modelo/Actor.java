package modelo;

public class Actor {
	private int actor_id;
	private String first_name;
	private String last_name;
	private String fecha;

	public Actor(int i, String string, String string2, String string3) {
		this.actor_id=i;
		this.first_name=string;
		this.last_name=string2;
		this.fecha=string3;
		
	}

	public int getActor_id() {
		return actor_id;
	}

	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String loquesea) {
		this.fecha = loquesea;
	}
}
