package oo1.ejercicio13;

import java.util.*;

public class Email {
	private ArrayList<Archivo> adjuntos;
	private String cuerpo;
	private String titulo;
	
	public Email(String cuerpo,String titulo,ArrayList<Archivo> adjuntos) {
		this.adjuntos = adjuntos;
		this.cuerpo = cuerpo;
		this.titulo = titulo;	
	}
	public Email(String cuerpo,String titulo) {
		this.adjuntos = new ArrayList<>();
		this.cuerpo = cuerpo;
		this.titulo = titulo;	
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public String getTitulo() {
		return titulo;
	}
	public boolean buscar(String texto) {
		return this.cuerpo.contains(texto) || this.titulo.contains(texto);
	}
	public int calcularTamaño() {
		return this.cuerpo.length() + this.titulo.length() + this.adjuntos.stream().mapToInt(a -> a.tamaño()).sum();
	}
}
