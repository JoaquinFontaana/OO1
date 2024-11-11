package oo1.ejercicio3;
import java.util.*;
import java.time.*;
public class Presupuesto {
	private List<Item> items;
	private LocalDate fecha;
	private String cliente;
	
	public Presupuesto(String cliente) {
		this.cliente = cliente;
		this.fecha = LocalDate.now();
		items = new LinkedList<>();
	}
	public void agregarItem(Item item) {
		items.add(item);
	}
	public double calcularTotal() {
		return items.stream().mapToDouble(Item::costo).sum();
	}
	public List<Item> getItems() {
		return items;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public String getCliente() {
		return cliente;
	}
}
