package revision;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTestTest {

	@Test
	public void testTestConcatenate() {
		MyUnit = new MyUnit();
		
		MyUnit myUnit;
		String result = myUnit.concatenate("three", "four");
		
		assertEquals("threefour", result);
	}

}
