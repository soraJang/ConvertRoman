package mine.test;

import junit.framework.TestCase;
import mine.main.ConvertRoman;

public class ChangeTest extends TestCase {
	ConvertRoman change = new ConvertRoman();

	public void testChange() {
		assertEquals("I", change.convertRoman(1));
		assertEquals("II", change.convertRoman(2));
		assertEquals("III", change.convertRoman(3));
		assertEquals("IV", change.convertRoman(4));
		assertEquals("V", change.convertRoman(5));
		assertEquals("VI", change.convertRoman(6));
		assertEquals("VII", change.convertRoman(7));
		assertEquals("VIII", change.convertRoman(8));
		assertEquals("IX", change.convertRoman(9));
		assertEquals("X", change.convertRoman(10));
		assertEquals("XI", change.convertRoman(11));
		assertEquals("XII", change.convertRoman(12));
		assertEquals("XIII", change.convertRoman(13));
		assertEquals("XIV", change.convertRoman(14));
		assertEquals("XV", change.convertRoman(15));
		assertEquals("XIX", change.convertRoman(19));
		assertEquals("XX", change.convertRoman(20));
		assertEquals("XXX", change.convertRoman(30));
		assertEquals("XL", change.convertRoman(40));
		assertEquals("L", change.convertRoman(50));
		assertEquals("LX", change.convertRoman(60));
		assertEquals("LXX", change.convertRoman(70));
		assertEquals("LXXX", change.convertRoman(80));
		assertEquals("XC", change.convertRoman(90));
		assertEquals("XCIX", change.convertRoman(99));
		assertEquals("C", change.convertRoman(100));
	}
}
