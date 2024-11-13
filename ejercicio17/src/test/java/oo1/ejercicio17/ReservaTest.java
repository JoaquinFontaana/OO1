package oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

public class ReservaTest {
	private Reserva reserva;
	@BeforeEach
	public void setUp() {
		Propiedad p = new Propiedad("Departamento 2 ambientes","1924",10000,new PoliticaEstricta());
		reserva = new Reserva(LocalDate.now().minusDays(1),LocalDate.now().plusDays(2),p);
	}
	@Test
	public void consultarDisponibilidadTest() {
		assertEquals(true,reserva.consultarDisponibilidad(LocalDate.now().minusDays(3), LocalDate.now().minusDays(2)));
		assertEquals(false,reserva.consultarDisponibilidad(LocalDate.now().minusDays(1), LocalDate.now().plusDays(10)));
	}
	@Test 
	public void calcularPrecioTest() {
		assertEquals(40000,reserva.calcularPrecio());
	}
	@Test
	public void estaActiva() {
		assertEquals(true,reserva.estaActiva());
	}
}