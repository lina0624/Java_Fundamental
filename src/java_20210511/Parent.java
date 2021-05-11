package java_20210511;

public class Parent {
	String name;
	String address;
	int age;
	
	//alt + shift + s -> c (default 생성자)
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//alt + shift + s -> o (매개변수 있는 생성자)
	public Parent(String name, String address, int age) {  //클래스 Parent의 생성자 =>매개변수가 있는 생성자
		//super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	
}
