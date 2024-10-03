package core;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeApi {

	public static void main(String[] args) {
	
			LocalDate ld=LocalDate.of(2024,Month.AUGUST,16);
			/*		System.out.println(ld);
			Instant i=Instant.now();
			System.out.println(i);
		
		LocalTime lt=LocalTime.now(ZoneId.of("Europe/Monaco"));
		System.out.println(lt);
		Instant it=Instant.now();
		System.out.println(it);
		LocalDateTime ldt=LocalDateTime.now(ZoneId.of("Europe/Monaco"));
		System.out.println(ldt);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}	*/
		
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getYear());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getEra());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.isLeapYear());
		System.out.println(ld.getDayOfWeek());
		LocalTime lt=LocalTime.now();
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		System.out.println(lt.getNano());
		
	}

}
