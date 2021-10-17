package dsa.example.tree;

public class TreeTraversalPostOrder {
    void postOrder(BinaryTree root){

        if (root == null)
            return;

        postOrder(root.getLeftNode());
        postOrder(root.getRightNode());
        System.out.print(root.getData() + ",");
    }
}
