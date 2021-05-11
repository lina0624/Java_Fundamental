package java_20210503;

public class Test {
	public static void main(String[] args) {
		
		//이중 for문으로 별 출력하기:4-3-2-1
		/*
		for (int i =4; i > 0; i--) {
			for (int j =0; j <i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		*/
		
		//이중 for문으로 별 출력하기:1-2-3-4
		for (int i=0; i<4; i++) {
			for (int j =0; j<i+1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		
		}
	}
}
