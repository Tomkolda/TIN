package Graphs;

public class Path {
	private Graph graph;
	private Node startNode;
	private int pathValue;
	public Path(Graph graph, Node stratNode) {
		this.graph = graph;
		this.startNode = stratNode;
		this.pathValue = 0;
	}
	
	public void addNode(String node) {
		Node noden = graph.getNodeFromHashMap(node);
		if (noden == null) {
			System.out.println("This node dosent exist");
		}
		else {
			int value = startNode.getValue(noden);
			if (value == 0) {
				System.out.println("This is not nearby node from Node " + startNode);
			}
			else {
				pathValue += value;
				startNode = noden;
			}
		}
	}

	public int getPathValue() {
		return pathValue;
	}
	
	
	
	
}
