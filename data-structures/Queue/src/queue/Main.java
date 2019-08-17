package queue;

public class Main {
	public static void main(String[] args) {
//		Intq q = new Intq(); 
//		q.enqueue(3);
//		q.enqueue(4);
//		q.enqueue(6);
		
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());

//		q.showAll();
		
		Personq q = new Personq();
		q.enqueue(new Person("juan", "123"));
		q.enqueue(new Person("antonio", "321"));
		
		q.showAll();
	}
}
