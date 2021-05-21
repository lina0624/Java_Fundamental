package java_20210521;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://news.v.daum.net/v/20210521162624132");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println("protocol : "+protocol);
		System.out.println("host : "+host);
		System.out.println("port : "+port);
		System.out.println("path : "+path);
		System.out.println("query : "+query);
		System.out.println("ref : "+ref);
		
		
		//InputStream in = url.openStream(); // source:img
		
		
		
		
		InputStream in = url.openStream(); //source : html
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		FileWriter fw = new FileWriter("c:\\Users\\user\\Downloads\\test.html");
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
	
		
		