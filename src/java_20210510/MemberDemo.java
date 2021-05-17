package java_20210510;

public class MemberDemo {
	
	public static void print(Member m) {
		String name = m.getName();
		String email = m.getEmail();
		String zipcode = m.getZipcode();
		String addr1 = m.getAddr1();
		String addr2 = m.getAddr2();
		int age = m.getAge();
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(zipcode);
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(age);
		
	}

	
	
	public static void main(String[] args) {
		Member m =new Member();
		//m.name = "박리나";
		m.setName("박리나");
		m.setEmail("lina.park624@gmail.com");
		m.setZipcode("05507");
		m.setAddr1("서울 송파구 올림픽로 435");
		m.setAddr2("파크리오 아파트 304동 2602호");
		m.setAge(30);
		print(m);
		
		//print(name, email, zipcode, addr1, addr2, age);
	
	}
	
}
