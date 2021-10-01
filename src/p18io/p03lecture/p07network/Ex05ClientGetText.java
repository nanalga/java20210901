package p18io.p03lecture.p07network;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
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

public class Ex05ClientGetText {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket();
		socket.connect(new InetSocketAddress("172.30.1.10", 33333));
		
		InputStream is= socket.getInputStream();
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		Scanner scanner = new Scanner(System.in);
		OutputStream os = socket.getOutputStream();
		Writer w = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(w);
		
		// text 보내기
		String input = null;
		boolean run = true;
		while(run) {
			System.out.print("입력 > ");
			input = scanner.nextLine();
			
			if(input.equals("exit")) break;
			
			bw.write(input);
			bw.newLine();
			bw.flush();
		}
		
		// text 데이터 받기
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println("출력: " + line);
		}
		
		bw.close();
		br.close();
		socket.close();
		scanner.close();
	}
}
