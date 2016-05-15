package list;

import org.junit.Test;

import junit.framework.TestCase;

public class TestLinkedListOperation extends TestCase {

	@Test
	public void testAddToHead() {
		// 5==>3==>1==>6==>9==>7
		LinkedListNode head = null;
		head = Operations.addToHead(head, 7);
		head = Operations.addToHead(head, 9);
		head = Operations.addToHead(head, 6);
		head = Operations.addToHead(head, 1);
		head = Operations.addToHead(head, 3);
		head = Operations.addToHead(head, 5);
		assertEquals("5,3,1,6,9,7", Operations.getListAsString(head));
	}

	@Test
	public void testReverse() {
		// 5==>3==>1==>6==>9==>7 should be reverted to 7,9,6,1,3,5
		LinkedListNode head = null;
		head = Operations.addToHead(head, 7);
		head = Operations.addToHead(head, 9);
		head = Operations.addToHead(head, 6);
		head = Operations.addToHead(head, 1);
		head = Operations.addToHead(head, 3);
		head = Operations.addToHead(head, 5);
		head = Operations.reverseList(head);
		assertEquals("7,9,6,1,3,5", Operations.getListAsString(head));
	}

	@Test
	public void testKthToLastNode() {
		// 5==>3==>1==>6==>9==>7 should be reverted to 7,9,6,1,3,5
		LinkedListNode head = null;
		head = Operations.addToHead(head, 7);
		head = Operations.addToHead(head, 9);
		head = Operations.addToHead(head, 6);
		head = Operations.addToHead(head, 1);
		head = Operations.addToHead(head, 3);
		head = Operations.addToHead(head, 5);
		assertEquals("6", Operations.kthToLastNode(head, 3));
	}

	@Test
	public void testLargerKthToLastNode() {
		// 5==>3==>1==>6==>9==>7 should be reverted to 7,9,6,1,3,5
		LinkedListNode head = null;
		head = Operations.addToHead(head, 7);
		head = Operations.addToHead(head, 9);
		head = Operations.addToHead(head, 6);
		head = Operations.addToHead(head, 1);
		head = Operations.addToHead(head, 3);
		head = Operations.addToHead(head, 5);
		assertEquals("K cannot be larger than the size of list", Operations.kthToLastNode(head, 15));
	}

	@Test
	public void testCycleDetection() {
		// Line 106 to 107 creates a cyclic list as shown below.
		// Note 5 gets isolated after teh cycle is created.
		// 34==>25==>7==>3==>1==>6==>9-->5
		//           ^              ||
		//           ||             ||
		//           <======<====<==12

		LinkedListNode head = null;
		LinkedListNode node1 = null;
		LinkedListNode n = new LinkedListNode();

		head = Operations.addToHead(head, 5);
		head = Operations.addToHead(head, 9);
		node1 = head; // Keep Track of Node with Value 9
		head = Operations.addToHead(head, 6);
		head = Operations.addToHead(head, 1);
		head = Operations.addToHead(head, 3);
		head = Operations.addToHead(head, 7);

		// Create new Node
		n.data = 12;
		// Modify node1.next to point to new node instead of 5
		node1.next = n;
		// point new node to current head
		n.next = head;

		// By now a cycle is created
		// Continue add operation to head
		head = Operations.addToHead(head, 25);
		head = Operations.addToHead(head, 34);

		assertTrue(Operations.detectCycle(head));
	}

	@Test
	public void testCycleDetectionNegCase() {
		// 5==>3==>1==>6==>9==>7
		LinkedListNode head = null;

		head = Operations.addToHead(head, 7);
		head = Operations.addToHead(head, 9);
		head = Operations.addToHead(head, 6);
		head = Operations.addToHead(head, 1);
		head = Operations.addToHead(head, 3);
		head = Operations.addToHead(head, 5);

		assertFalse(Operations.detectCycle(head));
	}

	@Test
	public void testFindCycleInitPoint() {

		// Line 106 to 107 creates a cyclic list as shown below.
		// Note 5 gets isolated after teh cycle is created.
		// 34==>25==>7==>3==>1==>6==>9-->5
		//           ^              ||
		//          ||              ||
		//           <======<====<==12

		LinkedListNode head = null;
		LinkedListNode node1 = null;
		LinkedListNode n = new LinkedListNode();

		head = Operations.addToHead(head, 5);
		head = Operations.addToHead(head, 9);
		node1 = head; // Keep Track of Node with Value 9
		head = Operations.addToHead(head, 6);
		head = Operations.addToHead(head, 1);
		head = Operations.addToHead(head, 3);
		head = Operations.addToHead(head, 7);

		// Create new Node
		n.data = 12;
		// Modify node1.next to point to new node instead of 5
		node1.next = n;
		// point new node to current head
		n.next = head;

		// By now a cycle is created
		// Continue add operation to head
		head = Operations.addToHead(head, 25);
		head = Operations.addToHead(head, 34);

		// Detect Cycle
		assertTrue(Operations.findCyclicPoint(head).equals("7"));
	}

}
