package java_20210513;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//HashSet클래스는 데이터(객체)의 중복을 허용하지 않고, 순서가 없음
		//HashSet set = new HashSet();
		//TreeSet 클래스는 데이터(객체)의 중복을 허용하지 않고, natural ordering을 한다.
		//natural ordering: 숫자일때와 문자일때 정렬방식이 다름
		TreeSet set = new TreeSet();
		set.add("1"); 
		set.add("23");
		set.add("51");
		set.add("112");
		set.add("324");
		set.add("40");
		set.add("1");

		//HashSet 클래스는 자체적으로 출력할 방법이 없음.
		//HashSet을 Iterator로 변환해서 출력해야함.
		Iterator i = set.iterator();
		//hasNext() : Iterator에 출력할 객체가 존재하는지 판단하는 메서드
		//있으면 true, 없으면 false
		while(i.hasNext()) {         
			String temp = (String)i.next();  //String으로 넣었기 때문에, String으로 캐스팅
			System.out.println(temp);
		}
		
		
		TreeSet lottoSet = new TreeSet();
		while(true) {
			int random = (int)(Math.random()*45) +1;
			lottoSet.add(random); //add에는 primitive data type이 들어갈 수 없음. auto-boxing이 되서 Reference data type으로 들어간 것임
			if(lottoSet.size()==6) break;
		}
		Iterator i2 = lottoSet.iterator();
		
		while(i2.hasNext()) {         
			Integer temp2 = (Integer)i2.next();  //String으로 넣었기 때문에, String으로 캐스팅
			System.out.print(temp2+"\t");
		
		}
				
		
	}

}
