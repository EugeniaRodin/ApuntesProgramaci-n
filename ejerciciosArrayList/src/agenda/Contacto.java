package agenda;

public class Contacto {
	private int id;
	private String tlf, email;
	private Persona persona;
	private Empresa empresa;

	public Contacto(int id, String tlf, String email, Persona persona2, Empresa empresa2) {
		this.id = id;
		this.tlf = tlf;
		this.email = email;
		this.empresa = empresa2;
		this.persona = persona2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", tlf=" + tlf + ", email=" + email + ", persona=" + persona + ", empresa="
				+ empresa + "]";
	}
	
	
}
