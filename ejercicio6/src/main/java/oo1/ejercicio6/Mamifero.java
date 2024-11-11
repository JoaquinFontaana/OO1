package oo1.ejercicio6;
import java.time.*;
import java.util.*;
public class Mamifero {
	private String identificador = null;
	private String especie  = null ;
	private LocalDate fechaNacimiento  = null;
	private Mamifero padre  = null;
	private Mamifero madre  = null;
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	public Mamifero() {
		
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public String getIdentificador() {
		return identificador;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getEspecie() {
		return especie;
	}
	public Mamifero getAbuelaMaterna() {
		if(this.madre == null)
			return null;
		return this.madre.getMadre();
	}
	public Mamifero getAbuelaPaterna() {
		if(this.padre == null)
			return null;
		return this.padre.getMadre();
	}
	public Mamifero getAbueloMaterno() {
		if(this.madre == null)
			return null;
		return this.madre.getPadre();
	}
	public Mamifero getAbueloPaterno() {
		if(this.padre == null)
			return null;
		return this.padre.getPadre();
	}
	public boolean tieneComoAncestroA(Mamifero unMamifero){
		boolean arbolPadre = false;
		boolean arbolMadre = false;
		if(this.padre != null) {
			arbolPadre = this.padre.esAncestro(unMamifero.getIdentificador());
		}
		if(this.madre != null) {
			arbolMadre = this.madre.esAncestro(unMamifero.getIdentificador());
		}
		return arbolPadre || arbolMadre;
	}
	private boolean esAncestro(String id) {
		if (this.identificador.equals(id)) {
			return true;
		}
		else {
			boolean res = false;
			boolean res2= false;
			if(this.padre != null) {
				res = this.padre.esAncestro(id);
			}
			if(this.madre != null) {
				res2 = this.madre.esAncestro(id);
			}
			return res || res2;
		}
	}
}
