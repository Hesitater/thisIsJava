package chap11.example.sec111402;

import java.util.Calendar;

public class CalendarExample2 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);  		//년도를 리턴
		int month = now.get(Calendar.MONTH) +1 ;	//월을  리턴
		int day = now.get(Calendar.DAY_OF_MONTH);	// 일을 리턴
		int week = now.get(Calendar.DAY_OF_WEEK);	// 요일을 리턴
		int amPm = now.get(Calendar.AM_PM);			// 오전,오후를 리턴
		int hour = now.get(Calendar.HOUR);			// 시를 리턴
		int minute = now.get(Calendar.MINUTE);		// 분을 리턴
		int second = now.get(Calendar.SECOND);		// 초를 리턴
		
		System.out.println(
			year + " " + month + " " + day + " " + week + " " +amPm + " " +hour + " " +minute + " " + second	
				
				);
		
	}
}
