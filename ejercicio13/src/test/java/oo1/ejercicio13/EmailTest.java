package oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.*;

public class EmailTest {
	private Email email;
	
	@BeforeEach
	public void setUp() {
		ArrayList<Archivo> adjuntos = new ArrayList<>();
		Archivo a = new Archivo("1234");
		Archivo b = new Archivo("56");
		adjuntos.add(a);
		adjuntos.add(b);
		email = new Email("Hola","Saludo",adjuntos);
	}
	@Test
	public void buscarTest() {
		assertEquals(true,email.buscar("ola"));
		assertEquals(false,email.buscar("ld"));
	}
	@Test
	public void calcularTamañoTest() {
		assertEquals(16,email.calcularTamaño());
	}
}
