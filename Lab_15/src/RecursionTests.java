//Author ralstobj and zhaog2
import static org.junit.Assert.*;

import org.junit.Test;

public class RecursionTests {

	public static int findlowerCasex(String test, int s) {
		int l = test.length() - s + 1;
		if (l == 1) {
			return 0;
		}

		if (test.charAt(s) == 'x') {
			return 1 + findlowerCasex(test, s + 1);
		} else {
			return 0 + findlowerCasex(test, s + 1);
		}
	}

	public static int findlowerCasex(String test) {
		return findlowerCasex(test, 0);
	}

	public static int subStringCount(String test, String subString, int s) {
		int l = test.length() - s + 1;
		if (l <= subString.length()) {
			return 0;
		}

		if (test.substring(s, s + subString.length()).equals(subString)) {
			return 1 + subStringCount(test, subString, s + subString.length());
		} else {
			return 0 + subStringCount(test, subString, s + 1);
		}
	}

	public static int count7(int num) {
		num = Math.abs(num);
		if (num != 7 && num <= 10) {
			return 0;
		}
		if (num % 10 == 7) {
			return 1 + count7(num / 10);
		} else {
			return 0 + count7(num / 10);
		}
	}

	public static String replacePi(String text, int s) {
		int l = text.length() - s;

		if (l < 2) {
			return text.substring(s);
		}
		if (text.substring(s, s + 2).equals("pi")) {
			return "3.14" + replacePi(text, s + 2);
		} else {
			return text.charAt(s) + replacePi(text, s + 1);
		}

	}

	public static String replacePi(String text) {
		return replacePi(text, 0);
	}

	public static String seperateIdenticals(String text, int s) {
		int l = text.length() - s;

		if (l < 2) {
			return text.substring(s);
		}
		if (text.charAt(s) == text.charAt(s + 1)) {
			return text.charAt(s) + "*" + text.charAt(s + 1) + seperateIdenticals(text, s + 2);
		} else {
			return text.charAt(s) + seperateIdenticals(text, s + 1);
		}

	}

	public static String seperateIdenticals(String text) {
		return seperateIdenticals(text, 0);
	}

	public static String removex(String text, int s) {
		int l = text.length() - s + 1;
		if (l == 1) {
			return text.substring(s);
		}

		if (text.charAt(s) == 'x') {
			return removex(text, s + 1);
		} else {
			return text.charAt(s) + removex(text, s + 1);
		}
	}

	public static String removex(String text) {
		return removex(text, 0);
	}

	public long npower(long base, long n) {
		if (n == 1) {
			return base;
		} else {
			return base * npower(base, n - 1);
		}
	}

	public int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, remainder(x, y));
		}
	}

	public int remainder(int x, int y) {
		return x % y;
	}

	@Test
	public void subStringCountTest() {
		assertEquals(subStringCount("zzxyx", "xyx", 0), 1);
		assertEquals(subStringCount("xyxyx", "xyx", 0), 1);
		assertEquals(subStringCount("xyxxyx", "xyx", 0), 2);
	}

	@Test
	public void findlowerCasexTest() {
		assertEquals(findlowerCasex("zzz"), 0);
		assertEquals(findlowerCasex("xyxyx"), 3);
		assertEquals(findlowerCasex("xyxxyx"), 4);
	}

	@Test
	public void count7Test() {
		assertEquals(count7(-777), 3);
		assertEquals(count7(717), 2);
		assertEquals(count7(7), 1);
	}

	@Test
	public void replacePITest() {
		assertEquals(replacePi("pi"), "3.14");
		assertEquals(replacePi("pixypi"), "3.14xy3.14");

	}

	@Test
	public void seperateTest() {
		assertEquals(seperateIdenticals("yellow"), "yel*low");
		assertEquals(seperateIdenticals("mississipi"), "mis*sis*sipi");

	}

	@Test
	public void removeXTest() {
		assertEquals(removex("yelxlow"), "yellow");

	}

	@Test
	public void nPowerTest() {
		assertEquals(npower(3, 2), 9);

	}

	@Test
	public void gcdTest() {
		assertEquals(gcd(2, 3), 1);
		assertEquals(gcd(6, 3), 3);

	}

}
