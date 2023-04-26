package CV04;

public class LinkedList {
	Node head; // head of list
	Node last;
	
	static class Node {

		int data;
		Node next;
		Node previous;

		// Constructor
		Node(int d) {
			data = d;
			next = null;
			previous = null;
		}
	}

	// Method to insert a new node
	public void insertFirst(int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        new_node.previous = null;
        if (head == null) {
            head = new_node;
        } else if(head.next == null) {
            last = head;
            head = new_node;
            head.next = last;
            last.previous = head;
        }else {
            Node help = head;
            head = new_node;
            help.previous = head;
            head.next = help;

        }

    }
	
	public void insertLast(int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        new_node.previous = null;
        if (last == null) {
            last = new_node;
        } else if(last.previous == null) {
            head = last;
            last = new_node;
            head.next = last;
            last.previous = head;
        }else {
            Node help = last;
            last = new_node;
            help.next = last;
            last.previous = help;

        }

    }
	public void deleteFirst() {
		if (head == null) {
			return;
		} else {
			head = head.next;
			head.previous = null;
			

		}
		
	}
	
	public void deleteLast() {
		if (last == null) {
			return;
		} else {
			last = last.previous;
			last.next = null;
			

		}
		
	}
	

	public boolean exists(int cislo) {
		Node currNode = head;

		while (currNode != null) {
			if (currNode.data == cislo) {
				return true;
			}
			currNode = currNode.next;
		}
		return false;
	}

	// Method to print the LinkedList.
	public void printList() {
		Node currNode = head;
		Node lastNode = last;

		System.out.print("\nLinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}
		System.out.print("\nLinkedList backwards: ");
		while (lastNode != null) {
			// Print the data at current node
			System.out.print(lastNode.data + " ");

			// Go to next node
			lastNode = lastNode.previous;
		}
		System.out.println();
	}
}
