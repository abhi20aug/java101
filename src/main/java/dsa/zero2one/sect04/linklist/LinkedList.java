package dsa.zero2one.sect04.linklist;


public class LinkedList<T extends Comparable<T>> implements Cloneable {

    private Node<T> head = null;
    public LinkedList() {
    }

    //traverse
    @Override
    public String toString(){
        //start with head-node
        String str = null;
        Node<T> currentNode = head;
        //traverse till last node, where next is null
        while(currentNode != null){
            System.out.println(currentNode.toString());
            str = str+ currentNode.toString();
            currentNode = currentNode.getNext();
        }
        return str;
    }

    // addNode to end of list [ we have to traverse]
    public void appendLast(Node<T> node){
        if(head == null){
            head = node;
        } else {
            Node<T> currentNode = head;
            while(currentNode.getNext()!=null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
        }
    }

    // add node to beginning [move head pointer]
    public void addBeginning(Node<T> node){
        if(head == null){
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    // find an element in LinkedList [n traverse]
    public boolean findElement(Node<T> node){
        Node<T> curr = head;

        if (curr == null){
            return  false;
        } else {

            while(curr.getNext()!=null){
                curr = curr.getNext();
                if (node.getData() == curr.getData()){
                    return true;
                }
            }
        }
        return false;
    }

    // delete first element[o(1)]
    public String deleteFirst(){
        if(head == null){
            return "List empty";
        } else{
            if (head.getNext() == null){
                head = null;
                return "Head removed";
            } else {
                head = head.getNext();
                return "2nd element now first element";
            }
        }
    }

    // delete last element[o(n)]
    public String removeLast(){
        if(head == null){
            System.out.println("List empty");
        } else if (head.getNext() == null){
            head = null;
            System.out.println("removed head");
        } else {
            Node<T> curr = head;
            Node<T> previous = null;
            while(curr.getNext() !=null){
                previous = curr;
                curr = curr.getNext();
            }
            previous.setNext(null);
            System.out.println("set last node to null");
        }
        return "error";
    }

    // delete random element[o(n)]
    public void deleteElement(Node<T> node){
        if(head == null){
            System.out.println("List Empty");
        } else if (head.getNext() == null) {
            if (head.getData() == node.getData()) {
                head = null;
            }
        } else {
            if(head.getNext() !=null){
                Node<T> curr = head.getNext();
                Node<T> prev = head;

                if (curr.getData() == node.getData()){
                    head.setNext(null);
                } else {
                    while(curr.getNext()!= null){
                        prev =curr;
                        curr = curr.getNext();
                        if (curr.getData() == node.getData()){
                            prev.setNext(curr.getNext());
                        }
                    }
                }

            }
        }
    }

    // count number of nodes in list
    public int getCount(){
        Node<T> curr = head;
        int count =1;
        if(head == null){
            return 0;
        } else if (head.getNext() == null){
            return 1;
        } else{
            while(curr.getNext() != null){
                count ++;
                curr = curr.getNext();
            }
            return count;
        }
    }

}
