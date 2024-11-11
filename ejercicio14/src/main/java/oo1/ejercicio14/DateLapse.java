package oo1.ejercicio14;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	public LocalDate getTo() {
		return this.to;
	}
	public int sizeInDays() {
		return (int) from.until(to,ChronoUnit.DAYS) + 1;
	}
	public boolean includesDate(LocalDate other) {
		return (other.isEqual(from) || other.isAfter(from)) && 
		           (other.isEqual(to) || other.isBefore(to));
	}
}
