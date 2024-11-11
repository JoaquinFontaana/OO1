package oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class ReporteDeConstruccionTest {
	private ReporteDeConstruccion reporte;
	@BeforeEach
	public void setUp() {
		reporte = new ReporteDeConstruccion();
		PrismaRectangular prisma = new PrismaRectangular("Hierro","Gris",4,2,10);
		Cilindro cilindro = new Cilindro("Hierro","Rojo",10,20);
		Esfera esfera = new Esfera("Hierro","Gris",10);
		reporte.agregarPieza(prisma);
		reporte.agregarPieza(cilindro);
		reporte.agregarPieza(esfera);
	}
	@Test
	public void volumenMaterialTest() {
		double n = Math.round(reporte.volumenDeMaterial("Hierro") * 100.0)/100.0;
		double esperado = 4188.79 + 6283.19 + 80;
		assertEquals(esperado,n);
		assertEquals(0,reporte.volumenDeMaterial("Madera"));
	}
	@Test
	public void superficieMaterialTest() {
		double n = Math.round(reporte.superficieMaterial("Rojo")*100.0)/100.0;
		assertEquals(1884.96,n);
	}
}
