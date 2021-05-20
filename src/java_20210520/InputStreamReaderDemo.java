package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		
		/*
		InputStream in = System.in; //source가 키보드인 경우
		byte[] b = new byte[100];
		
		int readByteCount = 0;
		System.out.print("입력하세요>");
		while((readByteCount =in.read(b))!= -1) {
			String message = new String(b, 0, readByteCount);
			if(message != null && message.trim().equals("quit")) break;
			System.out.print(message);
			System.out.print("입력하세요>");
			
		}
		*/
		
		
		InputStream in = System.in; //1 byte => blocking되어있음. => 해제하려면, enter키를 넣어야 됨. 그때서야 read가 활성화됨
		InputStreamReader isr = new InputStreamReader(in); //2byte
		BufferedReader br = new BufferedReader(isr); //1줄 단위로 읽기 위해
		
		FileWriter fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\message.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String readLine = null;
		System.out.print("입력하세요>");
		while((readLine = br.readLine()) !=null) {
			if(readLine != null && readLine.equals("quit")) break;
			System.out.println(readLine); //모니터로 출력  => System.out의 반환값은 printStream임
			bw.write(readLine); //파일로 출력 (한줄씩 출력 가능) 
			bw.newLine(); //개행
			System.out.println("입력하세요>");
		}		
		bw.flush(); //flush를 안하면, 버퍼가 꽉 다 차기 전까진 출력 못함 => 반드시 flush해야함!
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		 
		Calendar cal = Calendar.getInstance();
		        
		System.out.println(sdf.format(cal.getTime()));
		
	}

}
