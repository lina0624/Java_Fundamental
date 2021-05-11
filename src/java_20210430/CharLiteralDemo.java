package java_20210430;

public class CharLiteralDemo {
	public static void main(String[] args) {
		//char 리터럴 => 문자 표현법
		char c1 = '박';
		char c2 = '리';
		char c3 = '나';
		
		//println은 출력 후 줄바꿈
		//print만 하면 옆으로 출력됨
		System.out.print(c1);		
		System.out.print(c2);
		System.out.println(c3);
	
		//char 리터럴 => 유니코드 표현법
		char c4 = '\ubc15';
		char c5 = '\uB9AC';
		char c6 = '\uB098';
		
		System.out.print(c4);
		System.out.print(c5);
		System.out.println(c6);
		
		//char 리터럴 => 아스키코드 표현법
		
		char c7 = 48;
		char c8 = 65;
		char c9 = 97;
		
		System.out.println(c7);
		System.out.print(c8);
		System.out.println(c9);
		
		//문자중에 사용할 수 없는 문자는 ', \
		//사용하기 위해서는 \를 사용해야 한다.
		char c10 = '\'';
		char c11 = '\\';
		
		System.out.println(c10);
		System.out.println(c11);
		
		//특수문자\t \n
		
		System.out.println("안녕하세요. \n저는 박리나입니다. \n잘 부탁드립니다.");
		System.out.println("Apple \tBanana \tCherry");		
		System.out.print("사과 \t바나나 \t체리\n");
		System.out.println
		
		('\t');
		System.out.println("아이디\t이름\t지역");
		System.out.println("pln9106\t박리나\t서울");
		
	}

}
