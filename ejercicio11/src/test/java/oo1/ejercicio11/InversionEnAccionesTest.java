package oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class InversionEnAccionesTest {
	private InversionEnAcciones inversion;
	@BeforeEach
	public void setUp() {
		inversion = new InversionEnAcciones(2, 100, "SAP");
	}
	@Test
	public void valorActualTest() {
		assertEquals(200,inversion.valorActual());
	}
}
