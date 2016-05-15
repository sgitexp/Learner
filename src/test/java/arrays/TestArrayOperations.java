package arrays;

import org.junit.Test;

import junit.framework.TestCase;

public class TestArrayOperations extends TestCase{

	
	@Test
	public void testDuplicate() {
		int[] a = {1,3,2,1};
		int dup= Operations.findDuplicate(a);
		assertTrue(dup == 1);
	}
	
	
	
}
