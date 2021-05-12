package java_20210512;

public class StringDemo2 {
	
	public static String reverse(String str) {
		
		String word = "";
		int i =str.length();
		for(int j=i; j>=1; j--) {
			word += str.substring(j-1, j);
		}
		return word;	
	}	
	
	public static void main(String[] args) {
		String str = "beautiful"; // =>"lufituaeb";
		String str5 = reverse(str);
		
		System.out.println(str5);
		
		//int i = str.length();
		//System.out.println(i);
	}

}
