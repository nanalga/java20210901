package p15collection.p02quiz.p01list;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Ex07Test {

	@Test
	void test() {
	Ex07 e = new Ex07();
		
		assertEquals(2, e.maxIndex(Arrays.asList(33, 3, 100, -80)));
		assertEquals(3, e.maxIndex(Arrays.asList(7, 8, 9, 10)));
		assertEquals(3, e.maxIndex(Arrays.asList(-10, -8, -6, -1, -5)));
		assertEquals(0, e.maxIndex(Arrays.asList(100, 50, 40, 100, 0)));
	}

}
