package Graphs;

import java.util.HashMap;

public class Node {
	String name;
	HashMap<Node, Integer> listNearby = new HashMap<>();
	public Node(String name) {
		
		this.name = name;
	}
	
	public void addNearby(Node node, int value) {
		if (listNearby.containsKey(node)) {
			System.out.println("This nearby is already add");
		}
		else {
			listNearby.put(node, value);
		}
	}
	
	public int getValue(Node node) {
		return listNearby.get(node);
	}
	
	
	
}
