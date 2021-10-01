package p18io.p03lecture.p06filter;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Ex07OutputStreamWriter {
	public static void main(String[] args) throws Exception {
		OutputStream os = getOutputStream("C:\\Users\\user\\Desktop\\iotest\\outtestH.txt");
		Writer writer = new OutputStreamWriter(os);
		
		
//		os.write('a');
//		os.write('한');	// 4바이트 중 1바이트 사용 -> 한글은 2바이트 -> 출력에는 1byte문자 출력
		
		writer.write('a');
		writer.write('한');
		
		writer.close();
		os.close();
	}
	
	public static OutputStream getOutputStream(String file) throws Exception {
		
		
		return new FileOutputStream(file);
	}

}

