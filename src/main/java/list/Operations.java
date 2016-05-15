package list;

public class Operations {

	public static LinkedListNode addToHead(LinkedListNode head, int data) {

		LinkedListNode newNode = new LinkedListNode();
		newNode.data = data;
		newNode.next = head;
		return newNode;
	}

	public static LinkedListNode reverseList(LinkedListNode node) {

		LinkedListNode current = node;
		LinkedListNode prev = null;
		LinkedListNode next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}

	public static String getListAsString(LinkedListNode head) {
		if (head == null)
			return "";
		StringBuffer buffer = new StringBuffer();
		while (head != null) {
			buffer.append(head.data);
			if (head.next != null)
				buffer.append(",");
			head = head.next;
		}
		return buffer.toString();
	}

	public static String kthToLastNode(LinkedListNode head, int k) {

		LinkedListNode kthNode = head;
		LinkedListNode nthNode = head;

		while (k > 0) {
			try {
				nthNode = nthNode.next;
				k--;
			} catch (NullPointerException e) {
				return "K cannot be larger than the size of list";
			}
		}

		while (nthNode != null) {
			nthNode = nthNode.next;
			kthNode = kthNode.next;
		}

		return String.valueOf(kthNode.data);

	}

	public static boolean detectCycle(LinkedListNode head) {

		LinkedListNode fastPointer = head;
		LinkedListNode slowPointer = head;
		boolean isThereACycle = true;

		do {
			if (fastPointer == null) {
				isThereACycle = false;
				break;
			}
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
			
		} while (fastPointer != slowPointer);
		
		return isThereACycle;
	}
	
	public static String findCyclicPoint(LinkedListNode head) {

		if(detectCycle(head) == false) return "";
		
		// start both runners at the beginning
	    LinkedListNode slowRunner = head;
	    LinkedListNode fastRunner = head;

	    // Detect the cycle
	    while (fastRunner != null && fastRunner.next != null) {
	        slowRunner = slowRunner.next;
	        fastRunner = fastRunner.next.next;
	        if (fastRunner == slowRunner) {
	            break;
	        }
	    }

	    //Take slowRunner to head
	    slowRunner = head ;
	    while(slowRunner != fastRunner ) {
	    	slowRunner = slowRunner.next;
	    	fastRunner = fastRunner.next;
	    }
	    
	    return String.valueOf(slowRunner.data);
	}
}
