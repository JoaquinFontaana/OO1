package oo1.ejercicio23;

public class Express extends Envio{
	private double precioKm;
	
	@Override
	public double calcularCosto() {
		CalculadoraDeDistancia c = new CalculadoraDeDistancia();
		Pedido p = this.getPedido();
		String direccion1 = p.getDireccionCliente();
		String direccion2 = p.getDireccionVendedor();
		return this.precioKm * c.distanciaEntre(direccion2, direccion1);
	}
}
