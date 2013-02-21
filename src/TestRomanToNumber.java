import static org.junit.Assert.*;

import org.junit.Test;


public class TestRomanToNumber {

	RomanToNumber converter = new RomanToNumber();
	
		@Test
		public void testI() {
			assertEquals(1,converter.toNumber("I"));
		}
		
		@Test
		public void testII() {
			assertEquals(2,converter.toNumber("II"));
		}
		
		@Test
		public void testV() {
			assertEquals(5,converter.toNumber("V"));
		}
		
		@Test
		public void testVI() {
			assertEquals(6,converter.toNumber("VI"));
		}
		
		@Test
		public void testX() {
			assertEquals(10,converter.toNumber("X"));
		}
		
		@Test
		public void testL() {
			assertEquals(50,converter.toNumber("L"));
		}
		
		@Test
		public void testC() {
			assertEquals(100,converter.toNumber("C"));
		}
		
		@Test
		public void testM() {
			assertEquals(1000,converter.toNumber("M"));
		}
		
		@Test
		public void testMCCLIX() {
			assertEquals(1259,converter.toNumber("MCCLIX"));
		}
		
		@Test
		public void testCMXCIX() {
			assertEquals(999 ,converter.toNumber("CMXCIX"));
		}
		
		@Test
		public void testException() {
			assertEquals(500 ,converter.toNumber("D"));
		}
		
		@Test
		public void testExceptionMMCXXIV() {
			assertEquals(2124 ,converter.toNumber("MMCXXIV"));
		}
		
}// TestRomanToNumber
