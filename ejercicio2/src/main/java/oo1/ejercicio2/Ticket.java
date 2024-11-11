package oo1.ejercicio2;
import java.time.*;
import java.util.*;
public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> productos;
	public Ticket(double pesoTotal,double precioTotal,int cantidadDeProductos,List<Producto> productos) {
		this.cantidadDeProductos= cantidadDeProductos;
		this.fecha = LocalDate.now();
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
		this.productos = productos;
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public double impuesto() {
		return this.precioTotal* 0.21;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public List<Producto> getProductos(){
		return new ArrayList<>(this.productos);
	}
}
