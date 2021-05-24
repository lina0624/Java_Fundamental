package java_20210514;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		/*
		list2.add("C");
		list2.add("B");
		list2.add(3,"A");
		*/
		
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println(list1.containsAll(list2));
		System.out.println(list1.retainAll(list2));
		
	}
}
