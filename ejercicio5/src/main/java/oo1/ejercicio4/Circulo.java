package oo1.ejercicio4;
import java.util.*;

public class Circulo extends Figura{
	private double diametro;
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
		this.actualizarDiametro();
		this.actualizarArea();
		this.actualizarPerimetro();
	}
	public Circulo() {
		
	}
	@Override
	public double calcularArea() {
		return Math.PI * (radio * radio);
	}
	@Override
	public double calcularPerimetro() {
		return Math.PI * diametro;
		
	}
	public double calcularDiametro() {
		return radio * 2;
	}
	public void actualizarDiametro() {
		this.diametro = this.calcularDiametro();
	}
	public void setRadio(double radio) {
		this.radio = radio;
		this.actualizarDiametro();
		this.actualizarArea();
		this.actualizarPerimetro();
	}

	public double getRadio() {
		return radio;
	}
	public double getDiametro() {
		return diametro;
	}
}
