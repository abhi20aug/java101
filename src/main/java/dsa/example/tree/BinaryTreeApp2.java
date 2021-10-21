package dsa.example.tree;

public class BinaryTreeApp2 {

    public static void main(String[] args) {


/*
        1
      /    \
    2       3
   /
  4
    \
     5
    / \
   6   7
        \
         8
 */


        TNode root = new TNode();
        root.setData(1);

        TNode node1 = new TNode();
        TNode node2 = new TNode();
        TNode node3 = new TNode();
        TNode node4 = new TNode();
        TNode node5 = new TNode();
        TNode node6 = new TNode();
        TNode node7 = new TNode();
        TNode node8 = new TNode();

        node1.setData(1);
        node2.setData(2);
        node3.setData(3);
        node4.setData(4);
        node5.setData(5);
        node6.setData(6);
        node7.setData(7);
        node8.setData(8);


        node1.setLeftNode(node2);
        node1.setRightNode(node3);

        node2.setLeftNode(node4);

        node4.setRightNode(node5);

        node5.setLeftNode(node6);
        node5.setRightNode(node7);

        node7.setRightNode(node8);

        TreeTraversalPostOrderNR postOrderNR = new TreeTraversalPostOrderNR();
        postOrderNR.postOrder(node1);

        TreeTraversalLevelOrderNR levelOrderNR = new TreeTraversalLevelOrderNR();
        levelOrderNR.levelOrder(node1);

    }
}
