package oo1.ejercicio20;

import java.time.LocalDate;

public class ReciboSueldo {
	private String nombre;
	private String apellido;
	private String cuil;
	private double antiguedad;
	private LocalDate fecha;
	private double montoTotal;
	
	public ReciboSueldo(Empleado empleado) {
		this.apellido = empleado.getApellido();
		this.cuil = empleado.getCuil();
		this.nombre = empleado.getNombre();
		this.antiguedad = empleado.calcularAntiguedad();
		this.fecha = LocalDate.now();
		this.montoTotal = empleado.getContratoActivo().calcularMonto();
	}
	
}
