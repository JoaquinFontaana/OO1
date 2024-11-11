package oo1.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


public class CuentaCorrienteTest {
	private CuentaCorriente cuenta1;
	private CuentaCorriente cuenta2;
	@BeforeEach
	public void setUp() {
		cuenta1 = new CuentaCorriente();
		cuenta2 = new CuentaCorriente();
		cuenta1.setSaldo(200);
		cuenta1.setLimiteDescubierto(150);
		cuenta2.setSaldo(20);
	}
	@Test
	public void testPuedeExtraer() {
		assertEquals(false,cuenta1.puedeExtraer(51));
		assertEquals(true,cuenta1.puedeExtraer(50));
	}
	@Test
	public void transferirACuenta() {
		assertEquals(true,cuenta1.transferirACuenta(50, cuenta2));
		assertEquals(false,cuenta1.transferirACuenta(50, cuenta2));
		assertEquals(150,cuenta1.getSaldo());
		assertEquals(70,cuenta2.getSaldo());
	}
}
