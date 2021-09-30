package p18io.p02quiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex08_2Test {

	@Test
	void test()  throws Exception  {
		Ex08_2 e = new Ex08_2();
		
		assertEquals("a가,b나,c다,라마,바사",e.split(2));
		assertEquals("a가b,나c다,라마바,사",e.split(3));
	}

}
