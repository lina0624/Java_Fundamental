package java_20210521;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {
	public static void main(String[] args) {
		String url = "http://www.imbc.com/";
		
		//HTML 문서를 관리하기 위한 객체
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
			System.out.println("성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Elements elements = doc.select(".notice-list li"); //notice-list 앞에있는 .은 css의 문법임. class를 접근할때는 . ID를 접근할때는 #
		for(Element element : elements) {
			System.out.println(element.text());
			
		}
		
		
		
	}

}
