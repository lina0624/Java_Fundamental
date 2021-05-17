package java_20210517;

public class IncorrectAccountExcetion extends Exception{

	public IncorrectAccountExcetion(String message) {
		super(message); //상위클래스의 생성자 호출 =>  첫 라인에만 나올 수 있음
		// TODO Auto-generated constructor stub
	}
	
}