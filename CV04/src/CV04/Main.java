package CV04;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

		
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(5);
		list.insertFirst(6);
		list.insertFirst(7);
		list.insertFirst(8);

		// Print the LinkedList
		list.printList();
		
		System.out.println(list.exists(5));
		System.out.println(list.exists(9));
		

		list.deleteFirst();

		list.printList();
		
		list.insertLast(9);
		list.printList();
		
		list.deleteLast();
		list.printList();
	}

}
