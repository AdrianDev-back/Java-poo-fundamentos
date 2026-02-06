package parallel_topics;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstantiantingDataAndTime {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2026-02-06");
		LocalDateTime d05 = LocalDateTime.parse("2026-02-06T13:04:25");
		Instant d06 = Instant.parse("2026-02-07T13:08:30Z");
		Instant d07 = Instant.parse("2026-02-06T13:09:10-03:00");
		
		LocalDate d08 = LocalDate.parse("06/02/2026", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime d09 = LocalDateTime.parse("06/02/2026 13:28", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 02, 06);
		LocalDateTime d11 = LocalDateTime.of(2026, 02, 06, 13, 44);
		
		
		
        // O toString dos 3 tipos de data-hora por padrao gera um texto
	    // no formato ISO 8601.
		System.out.println("d01 = " + d01.toString()); 
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);

		
		
		
	}

}
