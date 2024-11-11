package oo1.ejercicio13;

import java.util.*;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private ArrayList<Carpeta> carpetas;
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("Inbox");
		this.carpetas = new ArrayList<>();
	}
	public void recibir(Email mail) {
		this.inbox.agregarEmail(mail);
	}
	public Email buscar(String texto) {
		Email res = this.inbox.buscar(texto);
		if(res != null) {
			return res;
		}
		return this.carpetas.stream()
				.map(c -> c.buscar(texto))
				.filter(e -> e  != null)
				.findFirst()
				.orElse(null);
	}
	public int espacioOcupado() {
		int n = this.carpetas.stream()
				.mapToInt(c -> c.calcularTamaño())
				.sum();
		return n + this.inbox.calcularTamaño();
	}
}
