package dsa.example.tree.exercises;

public class TreeOperations {

    static int count;
    static int countNodes(Node node){
        if (node == null){
            System.out.println("counted Node at leaf"+ " current: "+count);
            return 0;
        } else{
            System.out.println("counted Node at "+node.getData() + " current: "+count);
            count++;
            countNodes(node.getLeft());
            countNodes(node.getRight());
        }
        return count;
    }


}
