package oo1.ejercicio23;

public class Pedido {
	private Producto producto;
	private int cant;
	private Cliente cliente;
	private Pago pago;
	private Envio envio;
	
	public Pedido(Envio envio, Pago pago, Cliente cliente, int cant, Producto producto) {
		this.cant = cant;
		this.cliente = cliente;
		this.envio = envio;
		this.pago = pago;
		this.producto = producto;
	}
	
	public String getDireccionVendedor() {
		return this.producto.getDireccionVendedor();
	}
	public String getDireccionCliente() {
		return this.cliente.getDireccion();
	}
	public double calcularCostoTotal() {
		return this.pago.calcularPrecioFinal(this.cant * this.producto.getPrecio()) + this.envio.calcularCosto();
	}
	public String getCategoria() {
		return this.producto.getCategoria();
	}
}
