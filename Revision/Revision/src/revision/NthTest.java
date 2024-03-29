package revision;

import static org.junit.Assert.*;

import org.junit.Test;

public class NthTest {

	@Test
	public void testEveryNth() {
		
		Nth nth = new Nth();
		
		String outcome = nth.everyNth("Miracle",2);
		
		assertEquals("Mrce", outcome);
	}

	@Test
	public void testEveryNth1() {
		
		Nth nth = new Nth();
		
		String outcome = nth.everyNth("abcdefg",2);
		
		assertEquals("aceg", outcome);
	}
	
	@Test
	public void testEveryNth2() {
		
		Nth nth = new Nth();
		
		String outcome = nth.everyNth("abcdefg", 3);
		
		assertEquals("adg", outcome);
	}
}
