package java_20210504;

public class LotteryDemo {

	private int[] sixArray(int[] array) {
		
		int[] lotto = new int[6];
		for (int i =0; i<array.length; i++) {
			int random = (int)(Math.random() * 45)+1;
			boolean isExisted = false;
			for (int j=0; j<i; j++) {
				if(array[j] == random) {
					isExisted = true;
					break;
				}
			}
			if(isExisted) {
				i--;
			} else {
				array[i] = random;
			}
			
		}
		return array;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.random() => 0보다 크거나 같고 1보다 작은 임의 double 반환
		//int random = (int)(Math.random() * 45)+1; //1보다 크거나 같고 45보다 작은 int값을 반환
		
		
	
		int[] lotto = new int[6];
		for (int i =0; i<lotto.length; i++) {
			//1보다 크거나 같고 45보다 작은 임의의 int 반환
			int random = (int)(Math.random() * 45)+1;
			boolean isExisted = false;
			for(int j=0; j<i; j++) {
				if(random ==lotto[j]) {
					isExisted = true;
					break;
				}
			}
			if(isExisted) {
				i--; //여기서 -1을 하고 위의 for문으로 가서 다시 +1을 하면, 증감 없이 해당 인덱스 값이 들어가게 됨
 			}else {
				lotto[i] = random;
 			}	
			
		}
		
		//오름차순정렬
		for (int i=0; i<lotto.length; i++) {
			for (int j=0; j<lotto.length -(i+1); j++) {
				if (lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		/*
		//내림차순정렬
		for (int i=0; i<lotto.length; i++) {
			for (int j=0; j<lotto.length -(i+1); j++) {
				if (lotto[j] < lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		*/
		
		for(int value : lotto) {
			System.out.print(value +"\t");
		}



	}

}
