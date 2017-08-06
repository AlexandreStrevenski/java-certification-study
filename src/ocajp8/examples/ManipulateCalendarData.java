package examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ManipulateCalendarData {

	
	public static void main(String[] args) {
		
		//periodExample();
		
		//localTimeExample();
		
		//localDateTimeExample();
		
		//localDateExample();
		
		dateTimeFormatterExample();
	}
	
	private static void localDateExample() {
		LocalDate now = LocalDate.now();
		System.out.println(now);
	}

	private static void localDateTimeExample() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}

	/* The output is :
	 * 01:10
	 * 18:23:06.331
	 * 06:23:06.332
	 * 07:23:06.333
	 * 2
	 */
	public static void localTimeExample(){
		LocalTime of = LocalTime.of(1, 10);
		System.out.println(of);
		
		LocalTime nowHere = LocalTime.now();
		System.out.println(nowHere);
		
		LocalTime nowInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(nowInTokyo);

		LocalTime nowInMelbourne = LocalTime.now(ZoneId.of("Australia/Melbourne"));
		System.out.println(nowInMelbourne);

		LocalTime parse = LocalTime.parse("02:33");
		int hour = parse.getHour();
		System.out.println(hour);
		
		//LocalTime t = new LocalTime(); // can't compile
	}
	
	/* The output is :
	 * 	P21D
	 * 	P2D
	 * 	P1M21D
	 * 	P1M3D
	 * 	P1Y1M21D
	 */
	public static void periodExample(){
		Period period = Period.ofWeeks(3);
		System.out.println(period);
		
		Period withDays = period.withDays(2);
		System.out.println(withDays);
		
		Period withMonths = period.withMonths(1);
		System.out.println(withMonths);
		
		Period withDays2 = withMonths.withDays(3);
		System.out.println(withDays2);
		
		//Period withYears = withMonhs.withYears(1);
		//System.out.println(withYears);
		
	}
	
	public static void dateTimeFormatterExample(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd HH:mm");
		LocalDateTime now = LocalDateTime.now();
		String format = now.format(formatter);
		System.out.println(now);
		System.out.println(format);		
		
		int max = Integer.max(1, 5);
		System.out.println(max);
	}
	
	public static void f(){
	}
}
