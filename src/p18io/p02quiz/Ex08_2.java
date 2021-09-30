package p18io.p02quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex08_2 {
	public String split(int num) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\test4.txt";
		FileReader fr = null;
		
		char[] datas = new char[num];
		int len = 0;
		String res = "";
	
		
		try {
			fr = new FileReader(file);
			
			try {
				
				while((len = fr.read(datas)) != -1) {
					res += new String(datas, 0, len) + ",";
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return res.substring(0, res.length()-1);
	}
}
