package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("C:\\dev\\test\\2021\\05\\18\\FileInOutStreamDemo.java");
			br = new BufferedReader(fr); //stream chainning
			
			fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\FileInOutStreamDemo-copy3.java", true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true); //true는 auto flush
			
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				pw.println(readLine); //readLine 변수에는 개행을 포함X
				//bw.newLine(); //개행이 안됐기 때문에, newLine이 필요! (window - \r\n, unix - \n)
				System.out.println(readLine);
			}
			//bw.flush();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) fr.close();
				if (br != null) br.close();
				
				if (fw != null) fw.close();
				if (bw != null) bw.close();
				if (pw != null) pw.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}

	}

}
