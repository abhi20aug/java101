package dsa.example.tree;

public class TreeTraversalPreOrder {

    void preOrder(BinaryTree root){

        if (root == null)
            return;

        System.out.print(root.getData()+",");
        preOrder(root.getLeftNode());
        preOrder(root.getRightNode());
    }
}
