package Cvičný_projekt;


public class Node {

	char value;
    Node left;
    Node right;
 
    Node(char value) {
        this.value = value;
        right = null;
        left = null;
    }

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
    
    
}
