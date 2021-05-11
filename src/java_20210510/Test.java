package java_20210510;

public class Test {
	
	public static void print(Member m) {
		String name = m.getName();
		String email = m.getEmail();
		String zipcode = m.getZipcode();
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(zipcode);
	}
	
	
	
	public static void main(String[] args) {
		Member m = new Member();
		
		m.setName("홍성인");
		m.setEmail("nignus@gmail.com");
		m.setZipcode("05507");
		m.setAddr1("서울시 용산구");
		m.setAddr2("효창원로 하이츠빌라");
		
		print(m);
	
	}

}