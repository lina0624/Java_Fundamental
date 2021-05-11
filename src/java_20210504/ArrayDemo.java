package java_20210504;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언, 생성
		int[] a = new int[6];
		
		//배열 할당
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		//배열 출력
		
		/*
		for (int i = 0; i<a.length; i++) {
			int temp = a[i];
			System.out.println(temp);
		*/	
			
		//배열 선언, 생성, 할당이 동시에
		int[] b = {100,200,300,400};
		
		for (int j = 0; j<b.length; j++) {
			System.out.println(b[j]);
		}
		
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		//9월 15일까지 일수를 구하세요.
		
		int sum = 0;
		for (int i =0; i<8; i++) {
			sum += monthArray[i]; 
		}
		sum +=15;
	
		System.out.println("9월 15일 까지의 총일수는 " +sum+"일 입니다.");
		
		
		
		
		
		
		
		
		
		

	}

}
