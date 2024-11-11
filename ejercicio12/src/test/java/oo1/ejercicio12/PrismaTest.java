package oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrismaTest {
	private PrismaRectangular prisma;
	@BeforeEach
	public void setUp() {
		prisma = new PrismaRectangular("Hierro","Gris",4,2,10);
	}
	@Test
	public void volumenTest() {
		double n = Math.round(prisma.volumen() * 100.0) / 100.0;
		assertEquals(80,n);
	}
	@Test
	public void superficieTest() {
		double n = Math.round(prisma.superficie() * 100.0) / 100.0;
		assertEquals(136,n);
	}
}
