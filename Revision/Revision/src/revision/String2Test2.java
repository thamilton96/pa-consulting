package revision;

import static org.junit.Assert.*;

import org.junit.Test;

public class String2Test2 {

	@Test
	public void testMiddleTwo() {

		String2 string2 = new String2();

		String outcome = string2.middleTwo("string");

		assertEquals("ri", outcome);

	}
}
