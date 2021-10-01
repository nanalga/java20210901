package p18io.p03lecture.p07network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		// Socket - 데이터 주고 받을때 필요한 객체
		// 누군가 연결 기다리고 있는 사람(서버 소켓) 필요
		// ServerSocket 객체 생성
		int port = 33333;
		InetSocketAddress endpoint = new InetSocketAddress("172.30.1.10", port);	// ip주소와 port받음
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(endpoint);	// 어느주소에 연결할지 대기하는 것
		
		System.out.println("연결 준비");
		
		Socket socket = serverSocket.accept();	// 서버 허용 메소드
		System.out.println(socket.getRemoteSocketAddress());	// 서버에 접속한 주소 조회
		
		System.out.println("연결 종료");
		
		socket.close();
		serverSocket.close();
	}
}
