package ordinariaAmpliacion;

import java.util.List;

public class Pedido {
	private String cliente;
	private List<String> productos;
	private double total;

	public Pedido(String cliente, List<String> productos, double total) {
		this.cliente = cliente;
		this.productos = productos;
		this.total = total;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<String> getProductos() {
		return productos;
	}

	public void setProductos(List<String> productos) {
		this.productos = productos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Pedido [cliente=" + cliente + ", productos=" + productos + ", total=" + total + "]";
	}

}
