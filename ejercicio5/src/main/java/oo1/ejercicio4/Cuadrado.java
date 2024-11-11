package oo1.ejercicio4;

import java.util.*;

public class Cuadrado extends Figura{
	private double lado;
	
	public Cuadrado(int lado) {
		this.lado = lado;
		this.actualizarArea();
		this.actualizarPerimetro();
	}
	public Cuadrado() {
		
	}
	@Override
	public double calcularPerimetro() {
		return 4*lado;
	}
	@Override
	public double calcularArea() {
		return lado*lado;
		
	}
	public void setLado(int lado) {
		this.lado = lado;
		this.actualizarArea();
		this.actualizarPerimetro();
	}
	public double getLado() {
		return lado;
	}
	
}
