package revision;

import static org.junit.Assert.*;

import org.junit.Test;

public class BracketsTest {

	@Test
	public void testBalancedBrackets() {
		
		String result = Brackets.balancedBrackets("[()]");
		
		assertEquals("Balanced", result);
	}
	
	@Test
	public void testBalancedBrackets1() {
		
		String result = Brackets.balancedBrackets("{[]}");
		
		assertEquals("Balanced", result);
	}
	
	@Test
	public void testBalancedBrackets2() {
		
		String result = Brackets.balancedBrackets("[]{}()");
		
		assertEquals("Balanced", result);
	}
	
	@Test
	public void testBalancedBrackets3() {
		
		String result = Brackets.balancedBrackets("[)[)");
		
		assertEquals("Not Balanced", result);
	}
	
	@Test
	public void testBalancedBrackets4() {
		
		String result = Brackets.balancedBrackets("()]()");
		
		assertEquals("Not Balanced", result);
	}

}
