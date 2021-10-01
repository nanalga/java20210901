package p18io.p03lecture.p07network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02SendServerSendFile {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.10", 33333));
		
		System.out.println("연결준비================");
		
		Socket socket = serverSocket.accept();
		
		System.out.println("연결성공=================");
		
		InputStream is = new FileInputStream("C:\\Users\\user\\Desktop\\iotest\\keyboard.png");
		BufferedInputStream bis = new BufferedInputStream(is);
		
		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		System.out.println("파일 전송 시작====");
		
		int data = 0;
				
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		
		System.out.println("파일 전송 시작====");
		
		bos.close();
		bis.close();
		
		socket.close();
		serverSocket.close();
		
	}
}
