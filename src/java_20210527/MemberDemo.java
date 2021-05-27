package java_20210527;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		
		MemberDao dao = MemberDao.getInstance();
		
		/*
		int num = 13;
		//생성자가 없었다면 아래와 같이 코딩해야함 => 생성자를 사용하면, 코딩이 간략해질 수 있음!!
		//dto.setNum(num);
		//dto.setName(name);
		//dto.setAddr(addr);

		boolean success = dao.delete(num);
		if(success) {
			System.out.println("delete 성공");
		}else {
			System.out.println("delete 실패");
		}
		*/
		
		
		int start = 0;
		int len = 10;
		
		ArrayList<MemberDto> list = dao.select(start, len);
		for(MemberDto dto : list) {
			int num = dto.getNum();
			String name = dto.getName();
			String addr = dto.getAddr();
			System.out.printf("%d, %s, %s %n", num, name, addr);
		}
		
		
	}
}
