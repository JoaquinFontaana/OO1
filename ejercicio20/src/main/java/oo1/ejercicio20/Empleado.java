package oo1.ejercicio20;

import java.util.*;

public class Empleado {
	private String nombre;
	private String apellido;
	private String cuil;
	private String fechaNac;
	private boolean hijos;
	private boolean conyuge;
	private List<Contrato> contratos;
	
	public double calcularAntiguedad() {
		return this.contratos.stream().mapToDouble(c -> c.calcularDuracion()).sum();
	}
	
	public double calcularAdicionalAntiguedad() {
		double años = this.calcularAntiguedad();
		if(años < 5) {
			return 1;
		}
		if(años < 10) {
			return 1.30;
		}
		if(años < 15) {
			return 1.50;
		}
		if(años < 20) {
			return 1.7;
		}
		return 2;
	}
	public Contrato getContratoActivo() {
		return this.contratos.stream().filter(c -> c.activo()).findFirst().get();
	}
	public boolean isConyuge() {
		return conyuge;
	}
	public boolean getHijos() {
		return this.hijos;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCuil() {
		return cuil;
	}
	public String getApellido() {
		return apellido;
	}
}
