package revision;

import static org.junit.Assert.*;

import org.junit.Test;

public class BadTest {
	@Test
	public void testHasBad() {

		Bad bad = new Bad(); 

		boolean outcome = bad.hasBad("badxx");

		assertEquals(true, outcome);
	}

}