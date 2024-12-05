package oo1.ejercicio24;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Pasajero extends Usuario{
	private List<Viaje> viajes;
	@Override
	public double calcularComision(double monto) {
		if(this.viajes.stream()
				.filter(v -> Period.between(v.getFecha(), LocalDate.now()).getDays() >= 0)
				.anyMatch(v -> Period.between(v.getFecha(), LocalDate.now()).getDays() <= 30)) {
			return monto;
		}
		return monto * 1.10;
	}
	@Override
	public double calcularBonificacion(double monto) {
		if(this.viajes.isEmpty()) {
			return monto;
		}
		return monto-500;	
	}
	public boolean tieneSaldo() {
		return this.getSaldo() >= 0;
	}
	public void registrarViaje(Viaje viaje) {
		this.viajes.add(viaje);
	}
}
