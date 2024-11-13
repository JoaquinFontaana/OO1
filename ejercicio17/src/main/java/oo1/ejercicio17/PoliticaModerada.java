package oo1.ejercicio17;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada implements PoliticaCancelacion{
	public PoliticaModerada() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calcularDevolucion(Reserva reserva) {
		if(reserva.estaActiva()) {
			return 0;
		}
		int diferencia = (int) LocalDate.now().until(reserva.getFrom(),ChronoUnit.DAYS);
		if(diferencia >= 7) {
			return reserva.calcularPrecio();
		}
		else if(diferencia >= 2) {
			return reserva.calcularPrecio() * 0.5;
		}
		return 0;
	}
}
