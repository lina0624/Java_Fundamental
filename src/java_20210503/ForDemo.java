package java_20210503;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int sum = 0;
		for (int i = 1; i <= 10 ; i++) {
			sum = sum + i;
			
		}
		
		System.out.printf("1부터 10까지 합은 %d 입니다.\n", sum);

		
	    sum = 0;
		for (int i = 1; i <= 10 ; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.printf("1부터 10까지의 짝수 합은 %d 입니다.%n", sum);
		
		
		
		for (int first = 2; first <= 9; first++) {
			System.out.printf("%d단 입니다.%n", first);
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d %n", first, second, first*second);
				
			}
			
		}		
		
		
		int totalCountOfPrimeNumber = 0;
		int totalIndex = 0;
		//약수란 1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수다
		//예)2,3,5,7,....
		
		for (int i=2; i<=100; i++) {
			int count = 0;
			
			for (int j = 2; j<i; j++) {
				if(i%j==0) {
					count++;
					break;
				}
				totalIndex++;
			}
			if (count==0) {
				totalCountOfPrimeNumber++;
				System.out.print(i+ "\t");
			}
			totalIndex++;
		}
		System.out.println();
		System.out.println(totalCountOfPrimeNumber);
		System.out.println(totalIndex);
		
		/*
		int sum = 0;
		for (int a = 1; a <=100; a++) {
			for (int b = 2; b < a; b++) {
				if (a % b == 0); 
			}	
		}
		System.out.println(sum);
		System.out.
		
		*/
		
	}
	
}
