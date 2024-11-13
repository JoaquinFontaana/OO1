package oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

public class PropiedadTest {
	private Propiedad propiedad;
	@BeforeEach
	public void setUp() {
		propiedad = new Propiedad("Departamento 2 ambientes","1924",10000,new PoliticaEstricta());
	}
	@Test
	public void crearReservaTest() {
		propiedad.crearReserva(LocalDate.now().minusDays(1), LocalDate.now().plusDays(2));
		assertEquals(1,propiedad.getReservas().size());
		Reserva r = propiedad.crearReserva(LocalDate.now(), LocalDate.now().plusDays(1));
		assertEquals(null,r);
		assertEquals(1,propiedad.getReservas().size());
	}
	@Test
	public void calcularIngresosTest() {
		propiedad.crearReserva(LocalDate.now().minusDays(1), LocalDate.now().plusDays(2));
		propiedad.crearReserva(LocalDate.now().plusDays(10), LocalDate.now().plusDays(12));
		assertEquals(70000,propiedad.calcularIngresos());
	}
	@Test
	public void consultarDisponibilidadTest() {
		propiedad.crearReserva(LocalDate.now().minusDays(1), LocalDate.now().plusDays(2));
		propiedad.crearReserva(LocalDate.now().plusDays(10), LocalDate.now().plusDays(12));
		assertEquals(false,propiedad.consultarDisponibilidad(LocalDate.now(), LocalDate.now().plusDays(10)));
		assertEquals(true,propiedad.consultarDisponibilidad(LocalDate.now().minusDays(5), LocalDate.now().minusDays(2)));
	}
	@Test
	public void cancelarReservaTest() {
		Reserva r2 = propiedad.crearReserva(LocalDate.now().plusDays(3), LocalDate.now().plusDays(4));
		assertEquals(0,propiedad.cancelarReserva(r2));
	}
}
