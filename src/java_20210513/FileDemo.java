package java_20210513;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public static String format(File f) {
		//1970년 1월 1일 00:00:00초부터 파일을 수정한 날까지의 시간을 밀리세컨드로 반환한 값
		long lastModified = f.lastModified();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(lastModified);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String format = sdf.format(cal.getTime());
		return format;
	}
	
	public static void main(String[] args) {
		File f1 = new File("c:\\dev\\test\\2021\\05\\18"); //ctrl+shift+o => 외부 클래스 import 할 때
		
		//make directories 메소드
		if(f1.mkdirs()) {
			System.out.println("디렉토리를 생성했습니다.");
		}else {
			System.out.println("이미 디렉토리가 존재합니다.");
		}
		
		File f2 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse.zip");
		long len = f2.length();
		System.out.printf("%,dKB %n", len/1024);
		boolean isFile = f2.isFile(); // isDirectory()
		if(isFile) {
			String path = f2.getPath();
			if(path.endsWith("zip")) {
				System.out.println("압축파일");
			}else if(path.endsWith("txt")) {
				System.out.println("텍스트파일");
			}else if (path.endsWith("java")) {
				System.out.println("자바파일");				
			}
			
		}else {
			System.out.println("디렉토리 입니다.");
		}
		
		System.out.println(format(f2));
	
		File f3 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse2.zip");
		
		File f4 = new File("c:\\dev\\test\\2021\\05\\18","eclipse3.zip"); //(String Parent, String Child)
		
		f3.renameTo(f4); //f3파일을 f4파일 이름으로 변경
		
		String path = f4.getPath();
		String parent = f4.getParent();
		String name = f4.getName();
		System.out.printf("%s, %s, %s%n", path, parent, name);
		
		f4.delete();
		
		System.out.println();
		
		File f5 = new File("C:\\Users\\user\\eclipse-workspace\\Java_Fundamental");
		
		File[] files = f5.listFiles();
		for(int i=0; i<files.length; i++) {
			File f = files[i];
			if(f.isDirectory()) {
				String lastModified2 = format(f);
				String fileName = f.getName();
				System.out.printf("%s, %s, 파일폴더%n", fileName, lastModified2);
			
			}else if(f.isFile()) {
				String lastModified2 = format(f);
				String fileName = f.getName();
				long fileSize = f.length();
				System.out.printf("%s, %s, 파일, %,dB %n", fileName, lastModified2, fileSize);
				
			}
		}
		
		
	}

}
