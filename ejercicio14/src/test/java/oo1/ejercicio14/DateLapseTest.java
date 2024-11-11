package oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

public class DateLapseTest {
	private DateLapse periodo;
	@BeforeEach
	public void setUp() {
		periodo = new DateLapse(LocalDate.of(2005, 2, 1),LocalDate.of(2005, 3, 1));
	}
	@Test
	public void sizeInDaysTest() {
		assertEquals(28,periodo.sizeInDays());
	}
	@Test
	public void includesDateTest() {
		assertEquals(true,periodo.includesDate(LocalDate.of(2005,2,2)));
		assertEquals(true,periodo.includesDate(LocalDate.of(2005,2,1)));
		assertEquals(true,periodo.includesDate(LocalDate.of(2005,3,1)));
		assertEquals(false,periodo.includesDate(LocalDate.of(2002,2,2)));
	}
}
