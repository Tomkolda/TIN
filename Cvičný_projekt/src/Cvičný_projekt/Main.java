package Cvičný_projekt;

public class Main {

	public static void main(String[] args) {
		Tree strom = new Tree('B');
		strom.insert('D');
		strom.insert('A');
		strom.insert('C');
		strom.insert('E');
		
		
		System.out.println("\n" + "Traversing tree pre order");
        strom.traversePreOrder();
		
		strom.toList();
		
		System.out.println();
		System.out.println();
		System.out.println("Print List");
		
		strom.vypisListu();
		
	}

}
