package arrays;

public class Operations {
	
	/**
	 * Finds duplicate if there is an array of size n+1, containing n elements
	 * @return
	 */
	public static int findDuplicate(int[] a) {
		
			
		int dup = -1;
		int sp=0;
		int fp=0;
		
		do {
			
			fp = a[fp];
			fp = a[fp];
			sp = a[sp];
			
		} while(a[fp] != a[sp]);
		
		dup = a[sp];
		return dup;
	}

}
