package Cvičný_projekt;

import java.util.ArrayList;


public class Tree {
	private Node root;
	private ArrayList<Node> center = new ArrayList<Node>(); 

	public Tree(char data) {
		super();
		this.root = new Node(data);
		center.add(root);
	}
	
	public void insert(char value) {
		if (root == null) {
			root = new Node(value);
		} else {
			insert(root, value);
		}
	}
	
	private void insert(Node node, char data) {
		if ((int)data < (int)node.getValue()) {
			if (node.left != null) {
				insert(node.left, data);
			} else {
				System.out.println(" Inserted " + data + " to left of " + node.getValue());
				node.left = new Node(data);
				center.add(node.left);
			}
		} else if (data > node.getValue()) {
			if (node.right != null) {
				insert(node.right, data);
			} else {
				System.out.println("  Inserted " + data + " to right of " + node.getValue());
				node.right = new Node(data);
				center.add(node.right);
			}
		} else if (data == node.getValue()) {
			System.out.println("Value already insert");
		}
	}
	
	public void traversePreOrder() {
		traversePreOrder(root);
	}
	
	public void traversePreOrder(Node node) {
		System.out.print(node.value+ " ");
		if (node.left != null) {
			traversePreOrder(node.left);
		}
		if (node.right != null) {
			traversePreOrder(node.right);
		}
	}
	
	
	public void toList() {
		tolist(root);
	}

	private void tolist(Node node) {
		Node tmp;
		if (node.left != null) {
			tmp = node.right;
			node.right = node.left;
			node.left = null;
			node.right.right = tmp;
			tolist(node.right);
		}
		if (node.right != null) {
			tolist(node.right);
		}
		
	}
	
	public void vypisListu() {
		Node node = root;
		while(node.right != null) {
			System.out.println(node.value);
			node = node.right;
			
		}
		System.out.println(node.value);
	}
	
	
	
}
