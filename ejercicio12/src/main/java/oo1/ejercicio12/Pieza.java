package oo1.ejercicio12;

public abstract class Pieza {
	private String material;
	private String color;
	
	public abstract double volumen();
	public abstract double superficie();
	
	public Pieza(String material,String color) {
		this.material = material;
		this.color = color;
	}
	
	public String getMaterial() {
		return material;
	}
	public String getColor() {
		return color;
	}
}
