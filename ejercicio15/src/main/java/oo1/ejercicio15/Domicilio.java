package oo1.ejercicio15;

public class Domicilio {
	private double consumoActivo;
	private double consumoReactivo;
	
	public Domicilio() {
		this.consumoActivo = 0;
		this.consumoReactivo = 0;
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
}
