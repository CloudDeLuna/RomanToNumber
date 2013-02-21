import static org.junit.Assert.*;

import org.junit.Test;


public class TestNumberToRoman {

	NumberToRoman conv = new NumberToRoman();
	
	@Test
	public void test1000() {
		assertEquals("M",conv.toRoman(1000));
	}
	
	@Test
	public void test1000000() {
		assertEquals("MMMMMMMMMM",conv.toRoman(10000));
	}
	@Test
	public void test12() {
		assertEquals("XII",conv.toRoman(1239));
	}
	
	/*
	@Test
	public void test1() {
		assertEquals("I",conv.toRoman(1));
	}
	
	@Test
	public void test2() {
		assertEquals("II",conv.toRoman(2));
	}
	
	@Test
	public void test3() {
		assertEquals("III",conv.toRoman(3));
	}
*/

}
