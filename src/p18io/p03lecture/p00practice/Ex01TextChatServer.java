package p18io.p03lecture.p00practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex01TextChatServer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.10", 33344));
		
		System.out.println("서버 연결=====>");
		Socket socket = serverSocket.accept();
		System.out.println("서버 연결 완료=====>");
		
		// Client에게 메세지 보내기
		OutputStream os = socket.getOutputStream();
		Writer writer = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(writer);
		
		Scanner scanner = new Scanner(System.in);
		String input = null;
		boolean run = true;
		
		while(run) {
			System.out.print("Server : ");
			input = scanner.nextLine();
			
			if(input.equals("exit")) break;
			
			bw.write(input);
			bw.newLine();
			bw.flush();
		}
		
		// Client로 메세지 받을때
		InputStream is = socket.getInputStream();
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
		
		String line = null;
		
		while((line = br.readLine()) != null) {
			System.out.println("Client : " + line);
		}
		
		
		br.close();
		bw.close();
		socket.close();
		serverSocket.close();
		scanner.close();
	}
}


