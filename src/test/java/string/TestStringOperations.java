package string;

import org.junit.Test;

import junit.framework.TestCase;

public class TestStringOperations extends TestCase {

	@Test
	public void testReverseWords() {
		String s = "The eagle has landed";
		String reversedS = "landed has eagle The";
		assertEquals( Operations.reverseWords(s),reversedS );
	}
	
	@Test
	public void testReverseString() {
		String s = "aa bb ccc";
		String reversedS = "ccc bb aa";
		assertEquals( Operations.reverseString(s),reversedS );
	}
}
