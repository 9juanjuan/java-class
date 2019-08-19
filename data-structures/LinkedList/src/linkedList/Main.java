package linkedList;

public class Main {

	public static void main(String[] args) {
//		IntLinkedList list = new IntLinkedList();
//		list.insertItem(5);
//		list.insertItem(2);
//		list.insertItem(8);
//		list.printList();
//		
//		list.sortList();
//		System.out.println();
//		list.printList(); 
//		
		Person person1 = new Person ("Juan", "123");
		Person person2 = new Person ("Antonio", "321");
		Person person3 = new Person ("Garcia", "122");

		PersonLinkedList list = new PersonLinkedList(person1);
		list.insertItem(person2); 
		list.insertItem(person3); 
		
		list.printList();
	}
}
