package chap11.example.sec111402;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);  		//년도를 리턴
		int month = now.get(Calendar.MONTH) +1 ;	//월을  리턴
		int day = now.get(Calendar.DAY_OF_MONTH);	// 일을 리턴
		
		int week = now.get(Calendar.DAY_OF_WEEK);	// 요일을 리턴
		String strWeek = null;

		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;			
		default:
			break;
		}
		
		int amPm = now.get(Calendar.AM_PM);			// 오전,오후를 리턴
		String strAmPm = null;
		
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm ="오후";
		}
		
		
		int hour = now.get(Calendar.HOUR);			// 시를 리턴
		int minute = now.get(Calendar.MINUTE);		// 분을 리턴
		int second = now.get(Calendar.SECOND);		// 초를 리턴
		
		System.out.println(year +"년" + month + "월" + day + "일");
		System.out.println(strWeek + "요일" + strAmPm + " " );
		System.out.println(hour + "시" + minute + "분" + second +"초");
	}
}
