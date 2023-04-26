package Graphs;

public class Main {

	public static void main(String[] args) {
		Graph g = new Graph();
		g.addToGraph("1", "2", 4);
		g.addToGraph("1", "6", 6);
		g.addToGraph("1", "7", 16);
		g.addToGraph("2", "3", 24);
		g.addToGraph("3", "6", 23);
		g.addToGraph("3", "5", 18);
		g.addToGraph("3", "4", 9);
		g.addToGraph("4", "5", 11);
		g.addToGraph("4", "8", 7);
		g.addToGraph("5", "7", 10);
		g.addToGraph("5", "8", 14);
		g.addToGraph("6", "7", 8);
		g.addToGraph("6", "7", 15);
		g.addToGraph("6", "5", 5);
		g.addToGraph("7", "8", 21);
		
		System.out.println(g.toString()); 

		Path p = new Path(g, g.getNodeFromHashMap("1"));
		p.addNode("6");
		p.addNode("5");
		p.addNode("4");
		p.addNode("3");
		System.out.println("Value cost is = " + p.getPathValue());
	}

}
