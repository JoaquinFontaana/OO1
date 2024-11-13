package oo1.ejercicio18;

public class Internacional extends Envio{
	public Internacional(String origen,String destino,double peso) {
		super(origen, destino,peso);
	}
	@Override
	public double calcularCosto() {
		if(this.getPeso() <= 1000) {
			return 5000 + ( 10* this.getPeso());
		}
		return 5000 + (12 * this.getPeso());
	}
}
