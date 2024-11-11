package oo1.ejercicio12;
import java.util.*;
public class ReporteDeConstruccion {
	private ArrayList<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<>();
	}
	public void agregarPieza(Pieza p) {
		this.piezas.add(p);
	}
	
	public double volumenDeMaterial(String nombreMaterial) {
		return this.piezas.stream().filter(p -> p.getMaterial().equals(nombreMaterial)).mapToDouble(p -> p.volumen()).sum();
	}
	
	public double superficieMaterial(String color) {
		return this.piezas.stream().filter(p -> p.getColor().equals(color)).mapToDouble(p -> p.superficie()).sum();
	}
}
