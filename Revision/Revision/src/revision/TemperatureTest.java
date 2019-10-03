package revision;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureTest {

	@Test
	/**
	 * This method checks how temperatures inside bracket match with method IcyHot
	 */
	public void testIcyHot() {

		Temperature temperature = new Temperature();

		boolean outcome = temperature.icyHot(120, -1);

		assertEquals(true, outcome);
	}

	@Test
	public void testIcyHot1() {

		Temperature temperature = new Temperature();

		boolean outcome = temperature.icyHot(-1, 120); 
		
		assertEquals(true, outcome);
	}

	@Test
	public void testIcyHot2() {

		Temperature temperature = new Temperature();

		boolean outcome = temperature.icyHot(2, 120);
		
		assertEquals(false, outcome);

	}
}
