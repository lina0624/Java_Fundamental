package java_20210512;

public class ImplementsClassDemo {
	public static void main(String[] args) {
		interA i = new ImplementsClass(); //Interface는 인스턴스 생성 할 수 없음. 자식 클래스를 통해야 인스턴스 생성 가능
		i.mA();
		i.mB();
		i.mC();
		System.out.println(interA.PI);
		
		
		
	}

}
