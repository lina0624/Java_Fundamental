package java_20210512;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		//ctrl + shift + o -> auto import
		//자바 1.4 이전 버전에서는 primitive data type을 Collection에 저장할 수 없었기 때문에 
		//primitive data type을 객체화할 수 있는 Wrapper Class로 변환하여 저장해야 했다.
		//아래와 같이 1을 저장할 수 없음.
		ArrayList list = new ArrayList();
		list.add(1); //auto-boxing이 일어나서 에러가 나지 않는 것임
 		list.add(new Integer(1)); //숫자를 넣으려면 객체(object)를 생성해서 넣어야함
		
		//1. primitive data type => Wrapper class(valueOf(~)
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("20");
		
		//2. Wrapper Class => primitive data type(intValue() )
    	//int i3 = i1 + i2; => 오류나는 이유? i1, i2는 각각 class(레퍼런스 타입)이므로 연산할 수 없음!
		int i3 = i1.intValue();
		int i4 = i2.intValue();
		
		int i5 = i3+i4;
	
		//3. 숫자로 구성된 String => primitive data type
		//Integer.parseInt("10");
		String s1 = "12345";
		int i6 = Integer.parseInt(s1);
	
		//4. auto-boxing : primitive data type -> wrapper class
		Integer i7 =100; //내부적으로는 Integer.valueOf(10);이 생략된 것임 (이론적으로는 primitive data type이 reference data type에 들어가는 것은 말도 안되는 일임)
		Integer i8 = 200;
		
		//5. auto-unboxing : wrapper class -> primitive data type
		int i9 = i7+i8; //내부적으로는 intValue()가 생략된 것임 (원칙적으로는 reference data type간에는 연산 할 수 없음)
		
		
		
		
	}

}
