package oo1.ejercicio11;

import java.util.*;

public class Inversor {
	private String nombre;
	private ArrayList<Inversion> inversiones;
	public Inversor(String nombre) {
		this.nombre=nombre;
		this.inversiones= new ArrayList<>();
	}
	public void agregarInversion(Inversion i) {
		this.inversiones.add(i);
	}
	public double valorActual() {
		return inversiones.stream().mapToDouble(i -> i.valorActual()).sum();
	}
}
