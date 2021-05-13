package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2021,4,1);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); //MONTH는 0부터 카운트하기 때문에, print할때 1 더해줘야함
		int day = cal.get(Calendar.DATE);
		//int hour = cal.get(Calendar.HOUR);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		
		System.out.printf("%d년 %d월 %d일 %n", year, month+1, day);
		System.out.printf("%d: %d:%d%n", hour, minute, second);
		System.out.printf("%d요일입니다. %n", dayOfWeek);
		
		StringBuffer message = new StringBuffer();
	
		if(dayOfWeek == Calendar.SUNDAY) {
			message.append("일요일");
		}else if (dayOfWeek == Calendar.MONDAY) {
			message.append("월요일");	
		}else if (dayOfWeek == Calendar.TUESDAY) {
			message.append("화요일");	
		}else if (dayOfWeek == Calendar.WEDNESDAY) {
			message.append("수요일");	
		}else if (dayOfWeek == Calendar.THURSDAY) {
			message.append("목요일");	
		}else if (dayOfWeek == Calendar.FRIDAY) {
			message.append("금요일");	
		}else if (dayOfWeek == Calendar.SATURDAY) {
			message.append("토요일");	
		}	
	
		System.out.printf("%d년 %d월 %d일 %s입니다.%n", year, month+1, day, message.toString());
		
		//2020년 5월 13일은 무슨 요일일까요?
		cal.set(2000, 1, 13); //날짜를 변경할때 사용하는 메서드
	
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy년 MM월 dd일 HH시mm분ss초 E요일");
		
		//Date d = cal.getTime();
		//String display = sdf.format(d);
		//System.out.println(display);
		
		String display = sdf.format(cal.getTime());
		System.out.println(display);
		
		//해당 월의 마지막 날짜를 반환
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
	
		
	}
}

