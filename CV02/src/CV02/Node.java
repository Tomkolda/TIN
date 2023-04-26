package CV02;

import java.util.ArrayList;

public class Node {
	private ArrayList<Node> nodes = new ArrayList<Node>();
	
	public void addNode(Node node) {
		nodes.add(node);
	}

	
	public Node getNode(int poradi) {
		return nodes.get(poradi);
	}
	
	public void printNodes() {
		for (int i = 0; i < nodes.size(); i++) {
			System.out.println(nodes.get(i));
		}
	}
	
}
