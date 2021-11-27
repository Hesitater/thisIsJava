package chap11.example.sec111402;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CalcTimeZone {
	public static void main(String[] args) {
		
		TimeZone time;
		Date date = new Date();
		DateFormat df = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss (z Z)");

		time = TimeZone.getTimeZone("Asia/Seoul");
		df.setTimeZone(time);
		System.out.format("%s%n%s%n%n", time.getDisplayName(),
				df.format(date));

		time = TimeZone.getTimeZone("JST");
		df.setTimeZone(time);
		System.out.format("%s%n%s%n%n", time.getDisplayName(),
				df.format(date));

		time = TimeZone.getTimeZone("America/Los_Angeles");
		df.setTimeZone(time);
		System.out.format("%s%n%s%n%n", time.getDisplayName(),
				df.format(date));

		time = TimeZone.getTimeZone("America/New_York");
		df.setTimeZone(time);
		System.out.format("%s%n%s%n%n", time.getDisplayName(),
				df.format(date));

		time = TimeZone.getTimeZone("Pacific/Honolulu");
		df.setTimeZone(time);
		System.out.format("%s%n%s%n%n", time.getDisplayName(),
				df.format(date));
		
	}
}
