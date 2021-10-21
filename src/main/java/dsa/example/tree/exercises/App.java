package dsa.example.tree.exercises;

public class App {
    public static void main(String[] args) {

        GenerateTree tree = new GenerateTree();
        Node root = tree.getTree();

        RecursiveTraversal recursiveTraversal = new RecursiveTraversal();
        System.out.println("\n");
        recursiveTraversal.preOrder(root);
        System.out.println("\n");
        recursiveTraversal.inOrder(root);
        System.out.println("\n");
        recursiveTraversal.postOrder(root);
    }
}
