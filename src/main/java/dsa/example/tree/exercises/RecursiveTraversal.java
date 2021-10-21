package dsa.example.tree.exercises;

public class RecursiveTraversal {

    void preOrder(Node root){
        if (root !=null){
            System.out.print(root.getData()+",");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    void inOrder(Node root){
        if (root !=null){
            preOrder(root.getLeft());
            System.out.print(root.getData()+",");
            preOrder(root.getRight());
        }
    }

    void postOrder(Node root){
        if (root !=null){
            preOrder(root.getLeft());
            preOrder(root.getRight());
            System.out.print(root.getData()+",");
        }

    }

    void levelOrder(Node root){

    }

}
