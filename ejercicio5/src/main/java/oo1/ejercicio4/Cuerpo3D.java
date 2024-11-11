package oo1.ejercicio4;

public class Cuerpo3D {
	private double volumen = -1;
	private double superficie = -1;
	private Double altura = null;
	private Figura caraBasal = null;
	
	public Cuerpo3D() {
	
	}
	
	private double calcularSuperficie() {
		return 2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.altura;
	}
	private double calcularVolumen() {
		return this.caraBasal.getArea() * altura;
	}
	private void actualizarVolumen() {
		volumen = this.calcularVolumen();
	}
	private void actualizarSuperficie() {
		superficie = this.calcularSuperficie();
	}
	public void setAltura(double altura) {
		this.altura = altura;
		this.actualizarCuerpo();
	}
	public double getAltura() {
		return altura;
	}
	public double getVolumen() {
		return volumen;
	}
	public double getSuperficie() {
		return superficie;
	}
	public Figura getCaraBasal() {
		return caraBasal;
	}
	private void actualizarCuerpo() {
		if(altura != null) {
			if(caraBasal != null) {
				this.actualizarSuperficie();
			}
			this.actualizarVolumen();
		}
	}
	
	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
		this.actualizarCuerpo();
	}
}
