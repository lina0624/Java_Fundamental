package java_20210521;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://news.v.daum.net/v/20210521162624132");
		URLConnection urlCon = url.openConnection();
		
		
		String cacheControl = urlCon.getHeaderField("cache-control");
		String contentType = urlCon.getHeaderField("content-type");
		String date = urlCon.getHeaderField("date");
		
		System.out.println("cache-contrl : "+cacheControl);
		System.out.println("contentType : "+contentType);
		System.out.println("date : "+date);
		
		InputStream in = urlCon.getInputStream();
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		FileWriter fw = new FileWriter("c:\\Users\\user\\Downloads\\testNaver.html");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String readLine = null;
		while((readLine = br.readLine())!=null) {
			bw.write(readLine);
			bw.newLine();
			System.out.println(readLine);
		}
		bw.flush();

		
		
		
		
		
	
		
		
		
		
		

	}
	
}
