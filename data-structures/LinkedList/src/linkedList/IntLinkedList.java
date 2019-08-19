package linkedList;

public class IntLinkedList {
	private Node head;
	public IntLinkedList ( ) {
		head = new Node();
		head.value = 0;
		head.link = null;
	}
	
	public boolean insertItem (int item) {
		// For inserting at beginning of list
		Node n = new Node ();
//		n.value = item; 
//		n.link = head; 
//		head = n;
//		return true;
		// For inserting at end of list
		Node new_node = new Node();
		new_node = head;
		while (new_node.link != null) {
			new_node = new_node.link;
		}
		n.value = item;
		n.link = null;
		new_node.link = n; 
		return true;
		
	}
	public boolean deleteItem (int item) {
		if (head.value == item) {
			head = head.link;
			return true;
		} else {
			Node x = head;
			Node y = head.link;
			while(true) {
				if (y == null || y.value == item) {
					break; 
				} else {
					// x stores address of next node
					// y stores address of ITS next node (3rd node)
					x = y; 
					y = y.link;
				}
			}
			if (y !=null) {
				x.link = y.link;
				return true;
			} else {
				return false; 
			}
		}
	}
	public void sortList () {
		// bubble sort algorithm 
		int c = 0; 
		Node a = head.link; 
		while(a.link != null) {
			Node b = head.link;
			while (b.link != null) {
				if (b.value < b.link.value) {
					c = b.value;
					b.value = b.link.value;
					b.link.value = c;
				}
				b = b.link;
			}
			a = a.link; 
		}
		
	}
	
	
	public void printList() {
		Node z = head.link; 
		while(z!=null) {
			System.out.println(z.value);
			// list will continue to print and pass 
			// the link reference to the next node as it
			// iterates
			z = z.link;
		}
	}
	
	class Node {
		private int value;
		private Node link; 
	}
	
	
}
