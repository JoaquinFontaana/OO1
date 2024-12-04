package oo1.ejercicio23;

public class Producto {
	private String categoria;
	private int stock;
	private double precio;
	private String nombre;
	private Vendedor vendedor;
	
	public String getDireccionVendedor() {
		return this.vendedor.getDireccion();
	}
	public String getCategoria() {
		return this.categoria;
	}
	private boolean hayStock(int cant) {
		return this.stock >= cant;
	}
	public boolean decrementarStock(int cant) {
		if(this.hayStock(cant)) {
			this.stock -= cant;
			return true;
		}
		return false;
	}
	public double getPrecio() {
		return precio;
	}
}
