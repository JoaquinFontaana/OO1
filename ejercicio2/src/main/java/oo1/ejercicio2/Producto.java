package oo1.ejercicio2;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	public Producto() {
		
	}
	public double getPrecio() {
		return this.peso * this.precioPorKilo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
