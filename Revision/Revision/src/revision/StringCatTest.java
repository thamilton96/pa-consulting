package revision;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCatTest {

	@Test
	public void testConcatenate() {
		
		//calling method and assigning it a String
		String result = StringCat.concatenate("string1", "string2");
		
		//assigning String
		//String result = StringCat.concatenate("string1", "string2");
		
		assertEquals("string1string2", result);
	}

}
