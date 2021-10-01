package p18io.p03lecture.p00practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Ex02TextChatClient {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket();
		socket.connect(new InetSocketAddress("172.30.1.10", 33344));
		
		// Server로부터 메세지 받기
		InputStream is = socket.getInputStream();
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
		
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println("Server : " + line);
		}
		
		// Server로 메세지 보내기
		OutputStream io = socket.getOutputStream();
		Writer w = new OutputStreamWriter(io);
		BufferedWriter bw = new BufferedWriter(w);
		
		Scanner scanner = new Scanner(System.in);
		
		String input = null;
		boolean run = true;
		
		while(run) {
			System.out.print("Client : ");
			input = scanner.nextLine();
			
			if(input.equals("exit")) break;
			
			bw.write(input);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		br.close();
		socket.close();
		scanner.close();
	}
}
