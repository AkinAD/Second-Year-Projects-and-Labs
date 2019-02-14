package eecs2311.week3;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class CounterTest {
private Counter c;

	
	@Before
	public void setUp() throws Exception {
		c = new Counter();
	}

	@Test
	public void testIncrement() {
		assertEquals(1,c.increment());
		assertEquals(2,c.increment());
	}

	@Test
	public void testDecrement() {
		assertEquals(-1,c.decrement());
		assertEquals(-2,c.decrement());
	}
	@Test
	public void testIncValue()
	{
		assertEquals(7, c.increment(7));
		assertEquals(10, c.increment(3));
		
	}
	@Test
	public void testDecValue()
	{
		assertEquals(7, c.decrement(-7));
		assertEquals(3, c.decrement(4));
		
	}	
	@Test
	public void testResetInc() {
		assertEquals(5,c.increment(5));
		assertEquals(6,c.increment());
		assertEquals(0,c.reset());
	}
	
	@Test
	public void testResetDec() {
		assertEquals(8,c.decrement(-8));
		assertEquals(7,c.decrement());
		assertEquals(0,c.reset());
	}
	
	
	
}
