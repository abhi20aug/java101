package dsa.example.tree;

import java.util.LinkedList;
import java.util.Queue;


public class TreeTraversalLevelOrderNR {
    void levelOrder(TNode root) {

        Queue<TNode> queue = new LinkedList<>();
        TNode t = root;

        if(t!=null){
            queue.add(t);
            System.out.print(t.getData()+", ");
        }

        while (!queue.isEmpty()) {

            t = queue.poll();

            if (t.getLeftNode()!=null){
                queue.add(t.getLeftNode());
                System.out.print(t.getLeftNode().getData()+" ,");
            }

            if(t.getRightNode()!=null){
                queue.add(t.getRightNode());
                System.out.print(t.getRightNode().getData()+" ,");
            }

        }
    }
}
