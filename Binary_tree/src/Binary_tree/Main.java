package Binary_tree;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();
        System.out.println("Binary Tree Example");
        tree.insert(7);
        tree.insert(5);
        tree.insert(1);
        tree.insert(6);
        tree.insert(14);
        tree.insert(10);
        tree.insert(16);
        System.out.println();
        System.out.println("Traversing tree to find node that exists");
        tree.contains(6);
        System.out.println();
        System.out.println("Traversing tree to find node that doesn't exist");
        tree.contains(11);
        System.out.println("\n" + "Traversing tree pre order");
        tree.traversePreOrder();
        System.out.println("\n" +"Traversing tree in order");
        tree.traverseInOrder();
        System.out.println();
        System.out.println("Traversing tree post order");
        tree.traversePostOrder();
        System.out.println();
        System.out.println("Last Nodes");
        tree.getLastNodes();
        System.out.println();
        tree.insert(16);
        
	}

}
