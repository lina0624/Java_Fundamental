package java_20210507;

public class Test {
	
	int[] lottoArray(int[] array) {
		
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
		
	
			
		
		
		
		
		
		
		
		
		
	}

}
