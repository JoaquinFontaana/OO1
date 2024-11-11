package oo1.ejercicio4;

public abstract class Figura {
	private double perimetro;
	private double area;
	
	
	public abstract double calcularPerimetro();
	public abstract double calcularArea();
	public  double getArea() {
		return this.area;
	}
	public  double getPerimetro() {
		return this.perimetro;
	}
	public void actualizarArea() {
		this.area = this.calcularArea();
	}
	public void actualizarPerimetro() {
		this.perimetro  = this.calcularPerimetro();
	}
}
