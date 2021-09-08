package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountATest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting(); 
		int output = test.countA("alphabet an apple");
		assertEquals(4,output);
	}

}
