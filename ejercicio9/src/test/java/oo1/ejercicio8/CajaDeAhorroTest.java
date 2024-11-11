package oo1.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CajaDeAhorroTest {
	private CajaDeAhorro caja1;
	private CajaDeAhorro caja2;
	
	@BeforeEach
	public void setup() {
		caja1 = new CajaDeAhorro();
		caja2 = new CajaDeAhorro();
		caja1.setSaldo(50);
		caja2.setSaldo(100);
	}
	@Test
	public void testPuedeExtraer() {
		assertEquals(false,caja1.puedeExtraer(50));
	}
	@Test
	public void testTransferirACuenta() {
		assertEquals(true,caja2.transferirACuenta(90, caja1));
		assertEquals(140,caja1.getSaldo());
		assertEquals(10,caja2.getSaldo());
	}
	@Test
	public void testTransferirACuentaFondosInsuficientes() {
		assertEquals(false,caja2.transferirACuenta(99, caja1));
	}
	
}
