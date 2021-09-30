package p18io.p02quiz;

import java.io.FileReader;

public class Ex08 {
	public String split(int num) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\test4.txt";
		FileReader fr = new FileReader(file);
		char[] datas = new char[num];
		
		int cnt = 0;
		String res = "";
		
		while((cnt = fr.read(datas)) != -1) {
			res += new String(datas, 0, cnt) + ",";	// String(char[], int a1, int a2)->배열의 a1번째부터 a2개까지/ 데이터 0부터 cnt까지 
		}
		
		fr.close();
		return res.substring(0, res.length()-1);	// 마지막 , 제거 
	}
}
