package revision;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {
//JavaDoc
	@Test
	public void testConcatenate() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("one", "two");
		
		assertEquals("onetwo", result);
	}
	
	@Test //Each of these need their own separate Unit tests 
	public void testConcatenate1() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("three", "four");
		
		assertEquals("threefour", result);
	}
	
	public void testConcatenateSpace() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("three", "four");
		
		assertNotEquals("three , four", result);
	}


}
