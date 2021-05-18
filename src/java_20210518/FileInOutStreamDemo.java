package java_20210518;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\eclipse.zip");
			
			
			//매개변수 path의 디렉토리가 존재하지 않으면 예외 발생
			//예외가 발생하지 않고 객체가 생성되면 파일을 생성한다.
			//이때 무조건 빈파일을 생성함
			fos = new FileOutputStream("C:\\dev\\test\\2021\\eclipse-copy.zip"); //객체 생성만으로도 파일을 만들어줌.(새로운 파일이 생성되지만, 내용은 비어있어서 0KB임)
			
			/*
			int readByte = 0;
			long start = System.currentTimeMillis();
			
			//read()는 1바이트 읽어서 읽은 바이트를 반환한다.
			while((readByte = fis.read()) !=-1) {
				//write()는 1바이트 쓰기를 한다.
				fos.write(readByte);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d %n", (end-start));
			*/
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*100];
			long start = System.currentTimeMillis();
			while((readByteCount = fis.read(readBytes)) !=-1) {
				fos.write(readBytes,0, readByteCount);
			}
			
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d %n", (end-start));
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				if(fis !=null) fis.close();
				if(fos !=null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
