package java_20210527;

import java.util.ArrayList;

public class DeptDemo {
	public static void main(String[] args) {
		
		DeptDao dao = DeptDao.getInstance();
		
		/*
		int no = 50;
		String name = "MANAGING";
		String loc = "LA";

		DeptDto dto = new DeptDto(no, name, loc);
		*/
		
		/*
		boolean success = dao.insert(dto);
		if(success) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
			
		}
		*/
		
		/*
		boolean success = dao.update(dto);
		if (success) {
			System.out.println("update 성공");
		} else {
			System.out.println("update 실패");
		}
		*/
		
		/*
		boolean success = dao.delete(50);
		if (success) {
			System.out.println("delete 성공");
		} else {
			System.out.println("delete 실패");
		}
		*/
		
		int start = 0;
		int len = 10;
		
		ArrayList<DeptDto> list = dao.select(start, len);
		for(DeptDto dto : list) {
			int no = dto.getNo();
			String name = dto.getName();
			String loc = dto.getLoc();
			System.out.printf("%d, %s, %s%n", no, name, loc);
		}		
		
	}
	

}
