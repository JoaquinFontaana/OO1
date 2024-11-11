package oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class EsferaTest {
	private Esfera esfera;
	@BeforeEach
	public void setUp() {
		esfera = new Esfera("Hierro","Gris",10);
	}
	@Test
	public void volumenTest() {
		double n = Math.round(esfera.volumen() * 100.0) / 100.0;
		assertEquals(4188.79,n);
	}
	@Test
	public void superficieTest() {
		double n = Math.round(esfera.superficie() * 100.0) / 100.0;
		assertEquals(1256.64,n);
	}
}
