package org.test;

import org.junit.Assert;
import org.junit.Test;
import org.nums.Palindrome;

public class PalindromeTest {
	@Test
	public void test() {
		int number = Palindrome.getMax();
		Assert.assertEquals(-1, number);
		number = Palindrome.getMax(111, 222, 555, 7777);
		Assert.assertEquals(7777, number);
		number = Palindrome.getMax(255, 111, 195);
		Assert.assertEquals(9339, number);
		number = Palindrome.getMax(100, 120, 3445, 1653, 323);
		Assert.assertEquals(9339, number);
		number = Palindrome.getMax(100, 120, 3445, 16534, 323);
		Assert.assertEquals(431134, number);
	}
}
