package oo1.ejercicio12;

public class Esfera extends Pieza{
	private int radio;
	public Esfera(String material,String color,int radio) {
		super(material,color);
		this.radio = radio;
	}
	@Override
	public double volumen() {
		return (double) 4/3 * Math.PI * Math.pow(radio, 3);
	}
	@Override
	public double superficie() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}
}
