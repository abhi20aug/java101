package dsa.example.bst;

import dsa.example.bst.Node;

public class BinaryTree {
    Node getTree() {


/*
        10
      /    \
    8       30
   / \
  4   9
 / \
3   5
 */

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        Node node6 = new Node();
        Node node7 = new Node();

        node1.setData(10);
        node2.setData(8);
        node3.setData(30);

        node4.setData(4);
        node5.setData(9);

        node6.setData(3);
        node7.setData(5);

        node1.setLeft(node2);
        node1.setRight(node3);

        node2.setLeft(node4);
        node2.setRight(node5);

        node4.setLeft(node6);
        node4.setRight(node7);
        return node1;
    }
}
