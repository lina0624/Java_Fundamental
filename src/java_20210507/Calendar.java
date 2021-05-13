package java_20210507;

public class Calendar {

//과제
//1.년월일을 넣으면 요일을 알려주는 캘린더
//2.년월을 넣으면 한달치 달력을 보여주는 캘린더
//3.년간 달력을 보여주는 캘린더
	
	private int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	public static final int SUNDAY = 0;
	
	private boolean isLeafYear(int year) {
		return year%4==0 && year%100 !=0 || year%400==0;
	}
	private int getCount(int year, int month, int day) {
		int totalCount = 365 * (year-1) + 
				(year-1)/4 - //2020년까지 윤년 
				(year-1)/100 + //100의 배수 제외
				(year-1)/400;  //400의 배수 포함
		
		boolean isLeafYear = isLeafYear(year);
		if (isLeafYear) {
			monthArray[1] = 29;	
		}
		for (int i=0; i<month-1 ; i++) {
			totalCount +=monthArray[i];
		}
		totalCount +=day;
		
		return totalCount;
	}

	
	public void print(int year, int month, int day) {
	
		int totalCount = getCount(year, month, day);
		
		int dayOfWeek = totalCount % 7;
		String message = "";

		if (dayOfWeek == Calendar.MONDAY) {
			message = "월요일";
		} else if (dayOfWeek == Calendar.TUESDAY) {
			message = "화요일";
		} else if (dayOfWeek == Calendar.WEDNESDAY) {
			message = "수요일";
		} else if (dayOfWeek == Calendar.THURSDAY) {
			message = "목요일";
		} else if (dayOfWeek == Calendar.FRIDAY) {
			message = "금요일";
		} else if (dayOfWeek == Calendar.SATURDAY) {
			message = "토요일";
		} else if (dayOfWeek == Calendar.SUNDAY) {
			message = "일요일";
		}
		
		System.out.printf("%d년 %d월 %d일은 %s 입니다.%n", year, month, day, message);		
	}
	public void print(int year, int month) {		
		System.out.println(year+"년" +month+"월 달력입니다.");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//탭만큼 띄어쓰기 해야한다. 예)2021년 5월 달력을 출력하기 위해서는
		//2021년 5월 1일까지 총 날짜수를 구해서 7로 나눈 나머지 만큼 탭하면된다. 
		
		int totalCount = getCount(year, month, 1);
		int rest = totalCount%7; //예)2021년 5월 1일은 토요일(나머지 6)
		int count = 0;
		for(int i=0; i<rest; i++) {
			System.out.print("\t");
			count++;
		}

		for(int i=1; i<=monthArray[month-1]; i++) {
			System.out.print(i+"\t");
			count++;
			if(count%7==0) System.out.println();
			
		}
		System.out.println();
	}

	public void print(int year) {
		for(int i=1; i<=12; i++) {
			print(year, i);
		}
		
	}
}
