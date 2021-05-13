package java_20210513;

public class StringDemo {
	public static void main(String[] args) {
		char[] c = {'h', 'e', 'l', 'l', 'o'};
		String str = new String("hello"); //String(String original)
		
		//문자열 중에 특정 문자 하나만 반환하는 메소드
		//index는 0부터 시작
		char c1 = str.charAt(1);
		System.out.println(c1);
		
		//문자열 연결하는 메소드
		str = str.concat("123");
		System.out.println(str);
		
		//endsWith(String msg) => msg문자열로 끝나면 true, 그렇지 않으면 false
		str = new String("abc.zip");
		if(str.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		}else if(str.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
		}else {
			System.out.println("파일 입니다.");	
		}
		
		//startsWith(String mgs) => msg 문자열로 시작하면 true
		String url = new String("http://www.naver.com");
		String path = new String("/news/board.do?id=123&cat=1");
		if(path.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다.");
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		//equals() => 문자열 내용 비교
		//equalsIgnoreCase()=> 대소문자 구분하지 않고 비교
		//사용자에게 입력받은 값이라면 trim을 해줘야 함(공백 제거 필요)
		//trim() => 앞뒤 공백 제거
		String m1 = new String(" hello ").trim();
		String m2 = new String("hello");
		if(m1.equals(m2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//getBytes() => 문자열을 바이트 배열로 반환하는 메소드
		//일반적으로 사용하진 않지만, 네트워크로 보내야할 때는 한글을 바로 보낼 수 없기 때문에 바이트로 변환하여 전송
		String m3 = new String("안녕하세요");
		byte[] b = m3.getBytes();
		System.out.println(b);
		
		//indexOf() =>
		String m4 = new String("111111-1111118");
		int index = m4.indexOf("-");
		System.out.println(index);
		
		
		String m5 = new String("a.b.c.zip");
		int lastIndexOf = m5.lastIndexOf(".");
		System.out.println(lastIndexOf);
		
		//꼭 외워두자!
		//문자열에서 앞, 뒤 문자 뽑아내는 코딩(주민등록번호, 핸드폰 번호 등)
		System.out.print(m4.substring(0, m4.indexOf("-")));
		System.out.println(m4.substring(m4.indexOf("-")+1));
		
		System.out.println(m5.substring(0, m5.lastIndexOf(".")));
		System.out.println(m5.substring(m5.lastIndexOf(".")+1));
		
		//핸드폰번호에서 "-"제거하고 숫자만 뽑아내기
		String m6 = new String("010-5300-0624");
		index = m6.indexOf("-");
		lastIndexOf = m6.lastIndexOf("-");
		System.out.println(m6.substring(0, m6.indexOf("-")));
		System.out.println(m6.substring(m6.indexOf("-")+1,m6.lastIndexOf("-")));
		System.out.println(m6.substring(m6.lastIndexOf("-")+1));
		
		
		//Interger.parseInt는 문자열을 int로 변환해주는 메소드
		int a1 = Integer.parseInt(m4.substring(0, 1));
		String m7 = 123+"";
		String m8 = String.valueOf(123);
		String m9 = m6.replaceAll("0", "빵");
		System.out.println(m9);
		
		String m10 = new String("HELLO");
		System.out.println(m10.toLowerCase());
		
		String[] temp = m6.split("-");
		for (String value: temp) {
			System.out.println(value);
		}
		
		double d = 123456.345;
		System.out.printf("%,.2f%n",d); //이건 출력된 값이 double?? 
		System.out.format("%,.2f", d); //이건 출력된 값이 double??
		//String m13 = String.format("%,.2f", d);
		//System.out.println(m13);
		
	}

}
