package oo1.ejercicio15;

public class Domicilio {
	private double consumoActivo;
	private double consumoReactivo;
	private Factura factura;
	
	public Domicilio() {
		this.consumoActivo = 0;
		this.consumoReactivo = 0;
		this.factura = null;
	}
	public void setConsumoReactivo(double consumoReactivo) {
		this.consumoReactivo = consumoReactivo;
	}
	public void setConsumoActivo(double consumoActivo) {
		this.consumoActivo = consumoActivo;
	}
	public double getConsumoReactivo() {
		return consumoReactivo;
	}
	public double getConsumoActivo() {
		return consumoActivo;
	}
	public boolean esFactorPotencia() {
		return this.consumoReactivo/Math.sqrt(Math.pow(this.consumoActivo, 2)+Math.pow(this.consumoReactivo, 2)) > 0.8;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
}
