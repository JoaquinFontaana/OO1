package oo1.ejercicio23;

public abstract class Envio {
	private Pedido pedido;
	public abstract double calcularCosto();
	public Pedido getPedido() {
		return pedido;
	}
}
