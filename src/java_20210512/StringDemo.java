package java_20210512;

public class StringDemo {
	public static void m(int a, int[] b, String s) {
		a = 20;
		b[3] = 40000;
		s += "123";
		System.out.println(a+","+b[3]+","+s);
	}

	public static void main(String[] args) {
		
		int a = 10;
		int[] b = {1,2,3,4};
		String s = "abc"; //string클래스는 call by reference가 안됨 
		
		System.out.println(a+","+b[3]+","+s);
		m(a,b,s);
		System.out.println(a+","+b[3]+","+s); 
		
		
		/*
		String str1 = new String("hello");
		String str2 = new String("hello");		
		String str3 = "test";
		String str4 = "test";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		*/
		
		
	}

}
