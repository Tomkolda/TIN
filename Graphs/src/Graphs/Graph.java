package Graphs;

import java.util.HashMap;

public class Graph {
	private HashMap<String, Node> listNodes = new HashMap<>();
	
	public void addToGraph(String node1, String node2, int value) {
		Node n1 = checkIfExist(node1);
		Node n2 = checkIfExist(node2);
	
		n1.addNearby(n2, value);
		n2.addNearby(n1, value);
		
		
	}
	
	private Node checkIfExist(String node) {
		if (listNodes.containsKey(node)) {
			return listNodes.get(node);
		}
		else {
			Node newNode =  new Node(node);
			listNodes.put(node, newNode);
			return newNode;
		}
	}
	
	public Node getNodeFromHashMap(String node) {
		return listNodes.get(node);
	}

	@Override
	public String toString() {
		return "Graph [listNodes=" + listNodes + "]";
	}
	

}
