package dsa.example.tree;

import java.util.Iterator;
import java.util.Stack;

public class TreeTraversalPostOrderNR {

    void postOrder(TNode root){

        TNode t = root;
        TNode prev = null;
        Stack<TNode> stack = new Stack<>();
        int i =0;

        while((t != null || !stack.isEmpty()) && i < 15){
            i ++;
            System.out.println(" **************counter:************** "+i);
            //visit left child until its null
            if(t!=null){
                System.out.println ("\n current node "+t.getData() +" -> ");
                stack.push(t);
                Iterator<TNode> value = stack.iterator();
                System.out.print (" Stack[");
                while (value.hasNext()) {
                    TNode bt = (TNode)value.next();
                    System.out.print(bt.getData()+" ");
                };
                System.out.print ("]");
                t = t.getLeftNode();

            }

            //visit right child if null
            if ( t==null) {
                System.out.println("t is NULL");
                // peek from stack the parent of null node
                // check if right is null
                // if its null then we are done with visiting current node both left and right, hence print
                // pop the stack
                // t is still null
                if (stack.peek().getRightNode() == null) {
                    //its a leaf node, print it
                    System.out.println("Leaf, Print, Pop from stack ");
                    System.out.println(" **** "+stack.peek().getData() + " ,");
                    prev = stack.pop();
                    Iterator<TNode> value = stack.iterator();
                    System.out.print (" Stack[");
                    while (value.hasNext()) {
                        TNode bt = (TNode)value.next();
                        System.out.print(bt.getData()+" ");
                    };
                    System.out.print ("]");
                }

                // peek from stack the parent of null node
                // check if right is not null
                // if its not null then we are not done with visiting current node
                // we just visited left node
                // pop the stack
                if (stack.peek().getRightNode() != null && prev != stack.peek().getRightNode()) {
                    System.out.println("Not Leaf, trace further ");
                    t = stack.peek().getRightNode();
                }

                // peek from stack
                // check if right is not null
                // check if previous pop is same
                // we already visited left node, and right also
                // pop the stack
                if (stack.peek().getRightNode() != null && prev == stack.peek().getRightNode()) {
                    System.out.println("Coming Back , Pop");
                    prev = stack.pop();
                    Iterator<TNode> value = stack.iterator();
                    System.out.print (" Stack[");
                    while (value.hasNext()) {
                        TNode bt = (TNode)value.next();
                        System.out.print(bt.getData()+" ");
                    };
                    System.out.print ("]");
                    System.out.println(" **** "+prev.getData() + " ,");
                }


            }


        }

    }

}