package tests;
import static org.junit.Assert.*;
 import org.junit.Test;
 import implementation.Person;
public class TestA {
@Test
public void testInitWeightVal() {
	Person p = new Person("");
	assertTrue(p.getWeight() == -1.0);
	try {
		p.setWeight(-1.0);
		/* Expected precondition violation did not occur. */
		 fail("Weight is not positive, but no exception thrown.");
		}
		catch(IllegalArgumentException e) {
		 /* Expected precondition violation occurred. */
		 
	}
	
}
@Test
public void testInitHeightVal() {
	Person p = new Person("");
	assertTrue(p.getHeight() == -1.0);
	try {
		p.setHeight(-1.0);
		/* Expected precondition violation did not occur. */
		 fail("Height is not positive, but no exception thrown.");
		}
		catch(IllegalArgumentException e) {
		 /* Expected precondition violation occurred. */
		}
}
}
