package p15collection.p02quiz.p01list;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Ex12Test {

	@Test
	void test() {
		Ex12 e = new Ex12();
		
		assertEquals(true, e.mirror(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
		assertEquals(true, e.mirror(Arrays.asList(5, 4, 2, 2, 4, 5)));
		assertEquals(false, e.mirror(Arrays.asList(1, 2, 3, 1, 2, 3)));
		
		assertEquals(true, e.mirror2(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
		assertEquals(true, e.mirror2(Arrays.asList(5, 4, 2, 2, 4, 5)));
		assertEquals(false, e.mirror2(Arrays.asList(1, 2, 3, 1, 2, 3)));
		
		assertEquals(true, e.mirror2(Arrays.asList("book", "java", "html", "java", "book")));
		assertEquals(false, e.mirror2(Arrays.asList("spring", "servlet", "jsp")));
		
		assertTrue(e.mirror2(Arrays.asList(3, 4, 3)));
		assertFalse(e.mirror2(Arrays.asList(1, 2, 3)));
	}

}
