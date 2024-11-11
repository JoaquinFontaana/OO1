package oo1.ejercicio15;

import java.time.LocalDate;

public class Factura {
	private Domicilio domicilio;
	private LocalDate fechaEmision;
	private boolean bonificacion;
	private double montoFinal;
	private CuadroTarifario cuadro;
	public Factura(Domicilio domicilio,CuadroTarifario cuadro) {
		this.domicilio = domicilio;
		this.cuadro = cuadro;
		this.fechaEmision= LocalDate.now();
		this.bonificacion = this.factorPotencia();
		this.montoFinal = this.calcularMontoFinal();
	}
	private boolean factorPotencia() {
		double r = this.domicilio.getConsumoReactivo();
		double a = this.domicilio.getConsumoActivo();
		return r/Math.sqrt(Math.pow(a, 2)+Math.pow(r, 2)) > 0.8;
	}
	private double calcularConsumo() {
		return this.domicilio.getConsumoActivo() * this.cuadro.getPrecio();
	}
	private double calcularMontoFinal() {
		double total = this.calcularConsumo();
		if(this.bonificacion) {
			return total * 0.9;
		}
		return total;
	}
	public double getMontoFinal() {
		return this.montoFinal;
	}
}
