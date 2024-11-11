package oo1.ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	public Item(String detalle,int cantidad,double costoUnitario) {
		this.costoUnitario= costoUnitario; 
		this.detalle=detalle;
		this.cantidad = cantidad;
	}
	public double costo() {
		return cantidad*costoUnitario;
	}
	public double getCostoUnitario() {
		return costoUnitario;
	}
	public int getCantidad() {
		return cantidad;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
}
