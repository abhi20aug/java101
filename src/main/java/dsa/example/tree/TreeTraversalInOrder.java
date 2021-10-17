package dsa.example.tree;

public class TreeTraversalInOrder {

    void inOrderTraversal(BinaryTree root){

        if(root == null){
            return;
        }
        inOrderTraversal(root.getLeftNode());
        System.out.print(root.getData()+",");
        inOrderTraversal(root.getRightNode());
    }
}
