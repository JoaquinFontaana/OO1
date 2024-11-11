package oo1.ejercicio15;

public class Usuario {
	private String nombre;
	private Domicilio domicilio;
	
	public Usuario(String nombre,Domicilio domicilio) {
		this.domicilio =domicilio;
		this.nombre = nombre;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
}
