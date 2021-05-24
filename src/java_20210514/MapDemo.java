package java_20210514;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		//HashMap : key값은 유일해야 하고, value는 객체의 중복을 허용함
		HashMap map = new HashMap();
		
		//put 메소드(key, value값 설정)
		map.put("a", "1111");
		map.put("b", "2222");
		map.put("c", "3333");
		
		//get 메소드(인자에는 key값이 와야함)
		String value1 = (String)map.get("a");
		String value2 = (String)map.get("b");
		String value3 = (String)map.get("c");
		
		System.out.printf("%s , %s , %s %n",value1, value2, value3);
		
		//키, 값 동시 출력
		Set keySet = map.keySet();
		Iterator i = keySet.iterator();
		while(i.hasNext()) {
			String key = (String)i.next();
			String value = (String)map.get(key);
			System.out.printf("%s : %s %n", key, value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}