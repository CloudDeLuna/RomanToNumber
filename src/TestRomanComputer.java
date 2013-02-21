import static org.junit.Assert.*;

import org.junit.Test;


public class TestRomanComputer {

	RomanComputer computer = new RomanComputer();
	@Test
	public void testXI() {
		assertEquals("XI", computer.compute("IX + II"));
	}

}
