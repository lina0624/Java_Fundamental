package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test {
	public static void main(String[] args) {
		
		
		// 1. 드라이브 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2. DB를 연결할 connection 객체 생성
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1212");
		
			// 3. SQL을 전송할 수 있는 Preparedstatement 객체 생성
		
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE from member ");
			sql.append("WHERE num IN (?,?) ");

			pstmt = con.prepareStatement(sql.toString());
			
			// 4. 바인딩 변수 설정
			pstmt.setInt(1, 14);
			pstmt.setInt(2, 15);
			
			// 5. SQL문 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : "+resultCount);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			//6. 모든 자원 반납
			try {
				if (con !=null) con.close();
				if (pstmt != null) pstmt.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
