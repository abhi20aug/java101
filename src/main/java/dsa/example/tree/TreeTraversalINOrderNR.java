package dsa.example.tree;

import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;

import java.util.Stack;

public class TreeTraversalINOrderNR {

    void inOrder(BinaryTree root){
        System.out.println("\n Iterative inOrder");
        Stack<BinaryTree> stack = new Stack<>();
        BinaryTree t = root;

        while(t !=null || !stack.isEmpty()){
            if (t!=null){
                stack.push(t);
                t = t.getLeftNode();
            } else{
                t = stack.pop();
                System.out.print(t.getData()+", ");
                t = t.getRightNode();
            }
        }
    }
}
