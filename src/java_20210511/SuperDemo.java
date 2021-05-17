package java_20210511;

class A{
	int a;
	A(int a){ //생성자는 매개변수를 초기화하는 역할
		//super();
		this.a = a;
	}
	//A(){	
	//}
	
}

class B extends A{
	B(){ 
		super(10); //매개변수에 int a값이 들어가니 에러가 안남 =>상위클래스의 매개변수가 있는 생성자를 호출했기 때문에
	}
}


public class SuperDemo { //하나의 파일 안에 클래스를 여러개 만들 수 있지만, 접근한정자 public은 딱 하나의 클래스에만 붙일 수 있음
	public static void main(String[] args) {
		B b = new B ();
		System.out.println(b.a);
		
	}
	
	
}
