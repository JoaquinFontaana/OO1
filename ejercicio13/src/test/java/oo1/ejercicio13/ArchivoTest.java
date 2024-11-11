package oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArchivoTest {
	private Archivo arch;
	
	@Test
	public void tamañoTest() {
		arch = new Archivo("Objeto");
		assertEquals(6,arch.tamaño());
	}
}
