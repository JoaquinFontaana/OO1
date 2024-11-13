package oo1.ejercicio17;

public class PoliticaFlexible implements PoliticaCancelacion{
	public PoliticaFlexible() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calcularDevolucion(Reserva reserva) {
		if(reserva.estaActiva()) {
			return 0;
		}
		return reserva.calcularPrecio();
	}
}
