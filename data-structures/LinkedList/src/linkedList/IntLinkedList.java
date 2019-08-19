package linkedList;

public class IntLinkedList {
	private Node head;
	public IntLinkedList (int item) {
		head = new Node();
		head.value = item;
		head.link = null;
	}
	
	public boolean insertItem (int item) {
		Node n = new Node ();
		n.value = item; 
		n.link = head; 
		head = n;
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
	public void printList() {
		Node z = head; 
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
