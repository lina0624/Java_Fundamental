package java_20210430;

public class IfDemo {
	public static void main(String[] args) {
		// Run Configurations => Arguments => Program arguments

		int month = Integer.parseInt(args[0]);
		String season = "";
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month == 3 || month == 4 || month == 5) {
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "가을";
		} else {
			season = "없는 계절";
		}
		System.out.println(month + "월은 " + season + " 입니다.");

		int a = 125900;
		double d = 125234.782;
		String name = "박리나";

		System.out.printf("a는 %,d 입니다.%n", a);
		System.out.printf("d는 %,.2f 입니다.%n", d);

		int a1 = 100;
		String msg = "";
		if (a1 % 2 == 0) {
			msg = "짝수";
		} else {
			msg = "홀수";
		}

		System.out.println(msg);

		msg = (a1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(msg);
	}
	
}
