package oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

public class InversorTest {
	private Inversor inversor;
	@BeforeEach
	public void setUp() {
		inversor = new Inversor("Julian");
		PlazoFijo p = new PlazoFijo(100,2, LocalDate.now().minusDays(1));
		InversionEnAcciones inversion = new InversionEnAcciones(3, 100, "SAP");
		inversor.agregarInversion(inversion);
		inversor.agregarInversion(p);
	}
	@Test
	public void valorActualTest() {
		assertEquals(402,inversor.valorActual());
	}
}
