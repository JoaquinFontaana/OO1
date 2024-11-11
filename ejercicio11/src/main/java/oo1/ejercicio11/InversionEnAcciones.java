package oo1.ejercicio11;

public class InversionEnAcciones implements Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	public InversionEnAcciones(int cantidad,double valorUnitario,String nombre) {
		this.cantidad= cantidad;
		this.valorUnitario = valorUnitario;
		this.nombre = nombre;
	}

	@Override
	public double valorActual() {
		return this.cantidad * this.valorUnitario;
	}
}
