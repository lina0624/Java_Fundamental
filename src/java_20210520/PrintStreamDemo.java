package java_20210520;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null; //파일로 출력 (destination -> file)
		PrintStream ps1 = null; //모니터에 출력 (destination -> monitor)

		ps1 = System.out;
		ps1.println("Hello");
		ps1.println("안녕하세요");
		ps1.println("오늘은 비가 옵니다");
		
		try {
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			bis = new BufferedInputStream(fis); //stream chainning
			
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46-copy1.zip");
			bos = new BufferedOutputStream(fos); //stream chainning
			
			//PrintStream
			//1. PrintStream의 메서드는 IOException 발생하지 않는다.
			//2. auto flush 기능을 갖지 않음. => true를 줘야 auto flush기능 쓸 수 있음
			ps = new PrintStream(bos, true); //stream chainning
			
			
			int readByte = 0;
			while((readByte=bis.read())!= -1) {
				ps.write(readByte);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if (fis!=null) fis.close();
					if (bis!=null) bis.close();
					
					if (fos!=null) fos.close();
					if (ps!=null) ps.close();
					if (bos!=null) bos.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}


}
