package oo1.ejercicio11;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class PlazoFijoTest {
	private PlazoFijo inversion;
	@BeforeEach
	public void setUp(){
		LocalDate tiempo = LocalDate.now().minusDays(1);
		inversion = new PlazoFijo(100, 2, tiempo);
	}
	@Test
	public void valorActualTest() {
		assertEquals(102,inversion.valorActual());
	}
}
