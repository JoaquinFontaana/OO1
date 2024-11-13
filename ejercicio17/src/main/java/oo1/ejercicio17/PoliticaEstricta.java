package oo1.ejercicio17;

public class PoliticaEstricta  implements PoliticaCancelacion{
	public PoliticaEstricta() {

	}
	@Override
	public double calcularDevolucion(Reserva reserva) {
		return 0;
	}
}
