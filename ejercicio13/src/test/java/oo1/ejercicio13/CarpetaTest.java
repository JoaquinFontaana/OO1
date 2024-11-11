package oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class CarpetaTest {
	private Carpeta carpeta;
	private Carpeta carpeta2;
	private Email email;
	@BeforeEach
	public void setUp() {
		carpeta = new Carpeta("Facultad");
		carpeta2 = new Carpeta("Aburrido");
		Email email2= new Email("spam","boludo");
		email = new Email("Hola","Saludo");
		carpeta.agregarEmail(email);
		carpeta.agregarEmail(email2);
	}
	@Test
	public void moverTest() {
		carpeta.mover(email, carpeta2);
		assertEquals(1,carpeta.getCantidadEmails());
		assertEquals(1,carpeta2.getCantidadEmails());
	}
	@Test 
	public void buscarTest() {
		assertEquals(null,carpeta.buscar("sdf"));
		assertEquals(this.email,carpeta.buscar("ola"));
	}
	@Test
	public void calcularTamañoTest() {
		assertEquals(20,carpeta.calcularTamaño());
		assertEquals(0,carpeta2.calcularTamaño());
	}
}
