package p18io.p03lecture.p07network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex04ServerSendText {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.10", 33333));
		
		System.out.println("연결준비=====");
		Socket socket = serverSocket.accept();
		System.out.println("연결성공=====");
		
		Scanner scanner = new Scanner(System.in);
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		InputStream is = socket.getInputStream();
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println("출력 : " + line);
		}
		
		
		String input = null;
		boolean run = true;
		while(run) {
			System.out.print("입력 : ");
			input = scanner.nextLine();
			
			if(input.equals("exit")) {
				break;
			}
			bw.write(input);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		osw.close();
		os.close();
		scanner.close();
	}
}
