package string;

public class Operations {
	
	public static String reverseWords(String s) {
		
		int sI = 0;
		int eI = 0;
		int counter =0; 
		char a[] = s.toCharArray();
		
		reverseInplace(a, 0, a.length-1);
		while(counter < a.length) {
			if ( a[counter] == ' ') {
				eI = counter - 1;
				reverseInplace(a,sI, eI);
				sI = eI = counter + 1;
			} else {
				eI++;
			}
			counter++;
		}
		//Reverse leftovers
		reverseInplace(a, sI, eI-1);
		return new String(a);
	}
	
	public static void reverseInplace( char[] a, int startIndex, int endIndex ) {
		
		while( startIndex < endIndex) {
			char temp = a[startIndex];
			a[startIndex] = a[endIndex];
			a[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
	}
	
	
	public static String reverseString( String s ) {
		
		char a[] = s.toCharArray();
		int endIndex = a.length-1;
		int startIndex =0;
		while( startIndex < endIndex) {
			char temp = a[startIndex];
			a[startIndex] = a[endIndex];
			a[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
		return new String(a);
	}

}
