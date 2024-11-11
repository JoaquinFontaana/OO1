package oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class CilindroTest {
	private Cilindro pieza;
	
	@BeforeEach
	public void setUp() {
		pieza = new Cilindro("Hierro","Rojo",10,20);
	}
	
	
	@Test
	public void superficieTest() {
		double n = Math.round(pieza.superficie() * 100.00) / 100.0; 
		assertEquals(1884.96,n);
	}
	@Test
	public void volumenTest() {
		double n = Math.round(pieza.volumen() * 100.0) / 100.0;
		assertEquals(6283.19, n);
	}
}
