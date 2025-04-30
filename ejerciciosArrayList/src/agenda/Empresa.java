package agenda;

public class Empresa {
	private String sector;
	private String direccion;

	public Empresa(String sector, String direccion) {
		this.sector = sector;
		this.direccion = direccion;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Empresa [sector=" + sector + ", direccion=" + direccion + "]";
	}

}
