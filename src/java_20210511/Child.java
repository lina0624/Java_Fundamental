package java_20210511;

public class Child extends Parent {
	String phone;
	double weight;
	double height;
	
	public Child(String name, String address, int age, String phone, double weight, double height) {
		super(name, address, age); //상위 클래스의 매개변수가 있는 생성자 호출
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}
	
	public Child(String phone, double weight, double height) {
		super();
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}
	

}
