package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Ex07_2 {
	public Map<Character, Integer> count(String fileName) {
		Reader r = null;
		
		Map<Character, Integer> map = new HashMap<>();
		
		int datas = 0;
		
		try {
			r = new FileReader(fileName);
			
			try {
				while((datas = r.read()) != -1) {
					if(map.containsKey((char)datas)) {
						map.put((char)datas, map.get((char)datas)+1);
					} else {
						map.put((char)datas, 1);
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return map;
	}
}
