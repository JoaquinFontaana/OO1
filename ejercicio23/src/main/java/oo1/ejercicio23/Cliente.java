package oo1.ejercicio23;

import java.util.*;

import oo1.ejercicio21.BagImpl;

public class Cliente extends Usuario{
	private List<Pedido> pedidos;
	
	public void crearPedido(Pago pago,Envio envio,Producto producto,int cant) {
		if (producto.decrementarStock(cant)) {
			this.pedidos.add(new Pedido(envio,pago,this,cant,producto));
		}
	}
	public BagImpl<String> cantCategoria() {
		BagImpl<String> categorias = new BagImpl<>();
		this.pedidos.stream().forEach(p -> categorias.add(p.getCategoria()));
		return categorias;
	}
}
