package java_2021054.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private int port;
	//멤버변수 초기화는 생성자를 통해서, 다른 기능은 다른 메소드를 만들어서
	public EchoServer(int port) {
		this.port = port;
	}
	
	public void run() {
		ServerSocket serverSocket = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
	
		try {
			//1. ServerSocket 인스턴스를 생성한다.
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("[서버 화면입니다.]");
		while(true) {
			System.out.println("클라이언트 접속을 대기하고 있습니다....");
			try {
				//2. 클라이언트 접속을 기다린다.
				//accept() : 클라이언트 접속을 기다리다 클라이언트가 접속하면 클라이언트와 통신할 수 있는 Socket객체를 생성해준다.
				Socket socket = serverSocket.accept();
				//4. 클라이언트 통신할 수 있는 Socket 객체가 생성된다.
				InetAddress i  = socket.getInetAddress();
				System.out.println("클라이언트가 접속했습니다[" +i.getHostAddress()+"]");
				
				//5. Socket을 이용해서 클라이언트와 통신할 수 있는 입출력 스트림 생성
				InputStream in = socket.getInputStream();
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);
			
				//6-3
				OutputStream out = socket.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);
				
				while(true) {
					String readLine = br.readLine();
					System.out.println("클라이언트 메세지 : "+readLine);	
					bw.write(readLine);
					bw.newLine();
					bw.flush();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		//EchoServer echoServer = new EchoServer(3000);
		//echoServer.run();
		//위의 예시는 아래 한줄로 된 코딩과 동일한 표현을 2줄로 코딩한 것
		new EchoServer(3000).run();
		
	}
	
}
