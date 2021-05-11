package java_20210507;

public class Test02 {
	
	public boolean isLeafYear (int year) {
		return year%4==0 && year%100!=0 || year%400==0;
	}
	
	public void print(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		boolean isLeafYear = isLeafYear(year);
		
	}
	
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		
		int[] test02 = {3,19,98,23,24,80};
		int[] afterTest02 = md.ascending(test02);
		
		for(int i=0; i<afterTest02.length; i++) {
			System.out.print(afterTest02[i]+ "\t");
		}
		
	}
}
