package oo1.ejercicio18;

public class InterUrbano extends Envio{
	private int distancia;
	public InterUrbano(String origen,String destino,double peso,int distancia) {
		super(origen, destino,peso);
		this.distancia = distancia;
	}
	@Override
	public double calcularCosto() {
		if(this.distancia < 100) {
			return 20 * this.getPeso();
		}
		if(distancia <= 500) {
			return 25 * this.getPeso();
		}
		return 30 * this.getPeso();
	}
}
