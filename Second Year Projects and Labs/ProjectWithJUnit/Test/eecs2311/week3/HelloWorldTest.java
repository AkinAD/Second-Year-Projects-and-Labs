package eecs2311.week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

	HelloWorld hi;
	@BeforeEach
	void setUp() throws Exception {
		hi = new HelloWorld();
		assertEquals("Hello World!", hi.say());
	}

	@Test
	void testSay() {
		fail("Well you suck");
	}

}
