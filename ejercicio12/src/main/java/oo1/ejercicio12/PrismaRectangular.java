package oo1.ejercicio12;

public class PrismaRectangular extends Pieza{
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	public PrismaRectangular(String material,String color,int ladoMayor,int ladoMenor,int altura) {
		super(material,color);
		this.altura= altura;
		this.ladoMayor= ladoMayor;
		this.ladoMenor = ladoMenor;
	}
	@Override
	public double superficie() {
		return 2 * ((double) ladoMayor * ladoMenor+ ladoMayor * altura + ladoMenor * altura); 
	}
	@Override
	public double volumen() {
		return ladoMayor * (double) ladoMenor * this.altura;
	}
}
