package java_20210527;

public class MemberDtoDemo {
	public static void main(String[] args) {
		
		//MemberDto 인스턴스를 생성할때 매개변수 3개짜리 생성자를 호출
		//이렇게하면 MemberDto 인스턴스가 생성될때 인스턴스 변수를 초기화할 수 있음
		MemberDto dto3 = new MemberDto(10, "박리나", "서울");
		System.out.println(dto3.getNum());
		System.out.println(dto3.getName());
		System.out.println(dto3.getAddr());
		
		
		
		
	}

}
