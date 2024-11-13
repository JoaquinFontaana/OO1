package oo1.ejercicio18;

public class Local extends Envio{
	private boolean entregaRapida;
	public Local(String origen,String destino,double peso,boolean entregaRapida) {
		super(origen, destino,peso);
		this.entregaRapida = entregaRapida;
	}
	@Override
	public double calcularCosto() {
		if(this.entregaRapida) {
			return 1500;
		}
		return 1000;
	}
}
