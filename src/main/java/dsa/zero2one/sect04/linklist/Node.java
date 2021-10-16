package dsa.zero2one.sect04.linklist;

import java.util.Optional;

public class Node<T extends Comparable<T>> {

    private T data;
    private Node nextNode = null;

    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }

    public T getData(){
        return this.data;
    }

    public Node<T> getNext(){
        return this.nextNode;
    }


    public void setNext(Node<T> nextNode){
        this.nextNode = nextNode;
    }

    @Override
    public String toString(){
        return "Data: "+ this.data +", nextNode: "+ Optional.ofNullable(this.nextNode).isPresent();
    }


}
