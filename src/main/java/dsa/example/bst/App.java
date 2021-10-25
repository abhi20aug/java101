package dsa.example.bst;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        BinaryTree bst = new BinaryTree();
        Node root =  bst.getTree();

        boolean present = TreeOperations.getKeyRecursive(root, 2);
        System.out.println("key: "+present);

        boolean presentIterative = TreeOperations.getKeyIterative(root, 2);
        System.out.println("presentIterative : "+presentIterative);

        Node treeUpdated = TreeOperations.insertKey(root, 2);
        boolean presentOps = TreeOperations.getKeyIterative(treeUpdated, 2);
        System.out.println("presentIterative : "+presentOps);

        Node treeUpdatedR = TreeOperations.insertRecursive(root, 2);
        boolean presentOpsR = TreeOperations.getKeyIterative(treeUpdatedR, 2);
        System.out.println("presentIterative : "+presentOpsR);

        //ArrayList<Integer> list = new ArrayList<>(1,2,3,4,5,6);
        //Node createTree = TreeOperations.insertRecursive(root, 2);


    }

}
