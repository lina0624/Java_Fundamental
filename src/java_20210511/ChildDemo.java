package java_20210511;

public class ChildDemo {
	public static void main(String[] args) {
		
		Child child = new Child("010-5300-0624", 50, 171);
		
		System.out.println(child.name);
		System.out.println(child.address);
		System.out.println(child.age);
		System.out.println(child.phone);
		System.out.println(child.weight);
		System.out.println(child.height);
		System.out.println(child.name);


		Child child2 = new Child("박리나", "서울 송파구", 30, "010-5300-0624", 50, 171);
	
		System.out.println(child2.name);
		System.out.println(child2.address);
		System.out.println(child2.age);
		System.out.println(child2.phone);
		System.out.println(child2.weight);
		System.out.println(child2.height);
		System.out.println(child2.name);

		
	}

}
