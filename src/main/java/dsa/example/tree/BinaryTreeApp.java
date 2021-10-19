package dsa.example.tree;

import java.util.LinkedList;

public class BinaryTreeApp {

    public static void main(String[] args) {

        BinaryTree root = new BinaryTree();
        root.setData(1);

        BinaryTree leftNode = new BinaryTree();
        leftNode.setData(2);
        BinaryTree rightNode = new BinaryTree();
        rightNode.setData(3);

        root.setLeftNode(leftNode);
        root.setRightNode(rightNode);

        BinaryTree leftLeftNodeL3 = new BinaryTree();
        leftLeftNodeL3.setData(4);
        BinaryTree lefRightNodeL3 = new BinaryTree();
        lefRightNodeL3.setData(5);

        leftNode.setLeftNode(leftLeftNodeL3);
        leftNode.setRightNode(lefRightNodeL3);

        BinaryTree rightLeftNodeL3 = new BinaryTree();
        rightLeftNodeL3.setData(6);
        BinaryTree rightRightNodeL3 = new BinaryTree();
        rightRightNodeL3.setData(7);

        rightNode.setLeftNode(rightLeftNodeL3);
        rightNode.setRightNode(rightRightNodeL3);

        TreeTraversalPreOrder preOrderTraversal = new TreeTraversalPreOrder();
        System.out.print("\n PreOrderTraversal: ");
        preOrderTraversal.preOrder(root);

        TreeTraversalPostOrder postOrder = new TreeTraversalPostOrder();
        System.out.print("\n Post Order Traversal: " );
        postOrder.postOrder(root);

        TreeTraversalInOrder inOrder = new TreeTraversalInOrder();
        System.out.print("\n inOrder Traversal: " );
        inOrder.inOrderTraversal(root);

        TreeTraversalPreOrderNR preOrderNR = new TreeTraversalPreOrderNR();
        System.out.println("\n preOrder iterative");
        preOrderNR.preOrder(root);

        TreeTraversalINOrderNR inOrderNR = new TreeTraversalINOrderNR();
        inOrderNR.inOrder(root);


    }
}
