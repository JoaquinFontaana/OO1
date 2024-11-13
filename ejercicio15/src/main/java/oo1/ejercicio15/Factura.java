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
		this.bonificacion = this.domicilio.esFactorPotencia();
		this.montoFinal = this.calcularMontoFinal();
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
