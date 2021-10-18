package dsa.example.tree;

import java.util.Stack;
//data
//left
//right

public class TreeTraversalPreOrderNR {
    void preOrder(BinaryTree root) {
        // create a stack to hold ref
        Stack<BinaryTree> t = new Stack<>();
        BinaryTree bt = root;

        while (bt != null || !t.isEmpty()) {
            if (bt != null) {
                //print data
                System.out.print(bt.getData()+", ");

                //push in stack parent node
                t.push(bt);

                //move Left
                bt = bt.getLeftNode();
            } else {
                bt = t.pop();
                bt = bt.getRightNode();
            }
        }
    }
}
