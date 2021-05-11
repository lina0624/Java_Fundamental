package java_20210504;

public class test {
	public static void main(String[] args) {
		
		//해당 날짜의 요일 구하기 도전
		
		int year = 1981;
		int month = 10;
		int day = 11;
		
		//요일 구하기
		
		//1.1990년까지의 날 수 구하기 (윤년 처리 필요)
		
		int dayOfSum = 0;
		
		dayOfSum += 365*(year-1) + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		//2. 1991년 6월까지의 날 수 구하기 (array 사용해서)
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		boolean isLeafYear = year%4 ==0 && year%100 !=0 || year%400 ==0;
		
		if (isLeafYear) {
			monthArray[2] =29;
		}
		
		for (int i=0; i<month-1; i++) {
			dayOfSum += monthArray[i];
		}
		dayOfSum +=day;
		
		int dayOfWeek = dayOfSum%7;
		String season = "";
		
		if (dayOfWeek ==1 ) {
			season = "월요일";
		} else if (dayOfWeek ==2) {
			season = "화요일";
		} else if (dayOfWeek ==3) {
			season = "수요일";
		} else if (dayOfWeek ==4) {
			season = "목요일";
		} else if (dayOfWeek ==5) {
			season = "금요일";
		} else if (dayOfWeek ==6) {
			season = "토요일";
		} else {
			season = "일요일";			
		}
		System.out.print(season);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//달력만들기
		//2021년 5월 4일은 무슨 요일?? 
		
		
		int year = 2021;
		int month = 5;
		int day = 8;
		
		//1. 2020년까지의 날 수 (윤년의 갯수도 카운트 필요)
		int totalDays = 365 * (year-1) +
				(year-1)/4 -
				(year-1)/100 +
				(year-1)/400;
		//2. 5월 4일까지의 날 수 + 윤년 계산
		
		int[] monthArray = {31,28,31,30,31,30,31,31,39,31,39,31};
		boolean leafMonth = year%4 ==0 && year%100 !=0 || year/400 ==0;
		
		if(leafMonth) {
			monthArray[1] =29;
			
		}
		
		for (int i=0; i<month-1 ;i++) {
			totalDays += monthArray[i];
		}
		// 해당 월의 남은 일수를 더함
		totalDays +=day;
		
		int dayOfWeek = totalDays%7;
		String message ="";
		
		if (dayOfWeek == 1) {
			message = "월요일";
		} else if (dayOfWeek == 2) {
			message = "화요일";			
		} else if (dayOfWeek == 3) {
			message = "수요일";
		} else if (dayOfWeek == 4) {
			message = "목요일";
		} else if (dayOfWeek == 5) {
			message = "금요일";
		} else if (dayOfWeek == 6) {
			message = "토요일";
		} else {
			message = "일요일";
		}
		System.out.println(message);
 		*/



		
	}

}
