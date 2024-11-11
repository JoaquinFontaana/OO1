package oo1.ejercicio2;

import java.util.*;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> productos;
	public Balanza() {
		pesoTotal=0;
		precioTotal=0;
		cantidadDeProductos=0;
		productos = new ArrayList<>();
	}
	public void ponerEnCero() {
		this.pesoTotal = 0;
		this.precioTotal= 0;
		cantidadDeProductos=0;
		this.productos.clear();
	}
	public void agregarProducto(Producto producto) {
		this.pesoTotal+=producto.getPeso();
		this.precioTotal+=producto.getPrecio();
		this.cantidadDeProductos+=1;
		this.productos.add(producto);
	}
	public Ticket emitirTicket(){
		return new Ticket(pesoTotal, precioTotal, cantidadDeProductos,productos);
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	public List<Producto> getProductos() {
		return new ArrayList<>(productos);
	}
}
