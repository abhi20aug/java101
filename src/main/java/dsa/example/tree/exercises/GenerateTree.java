package dsa.example.tree.exercises;

import dsa.example.tree.exercises.Node;

public class GenerateTree {
    Node getTree() {


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


        Node root = new Node();
        root.setData(1);

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        Node node6 = new Node();
        Node node7 = new Node();
        Node node8 = new Node();

        node1.setData(1);
        node2.setData(2);
        node3.setData(3);
        node4.setData(4);
        node5.setData(5);
        node6.setData(6);
        node7.setData(7);
        node8.setData(8);

        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node4.setRight(node5);
        node5.setLeft(node6);
        node5.setRight(node7);
        node7.setRight(node8);
        return node1;
    }
}
