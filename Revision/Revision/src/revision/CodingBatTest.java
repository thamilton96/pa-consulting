package revision;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodingBatTest {

	@Test
	public void testStringE() {

		CodingBat codingBat = new CodingBat();

		boolean result = codingBat.stringE("Hello");

		assertEquals(true, result);

	}	


	@Test
	public void testStringE1() {

		CodingBat codingBat = new CodingBat();

		boolean result = codingBat.stringE("Heelle");


		assertEquals(true, result);

	}

	@Test
	public void testStringE2() {

		CodingBat codingBat = new CodingBat();

		boolean result = codingBat.stringE("Heelele");


		assertEquals(false, result);


	}
}