package dsa.zero2one.sect04.linklist;

public class LinkedListTest {
    public static void main(String[] args) {

        String data1 = "1st node";
        Node node = new Node(data1);
        Node node2 = new Node("2nd node");
        Node node3 = new Node("3rd node");

        LinkedList<String> ll = new LinkedList<>();

        //append at last
        ll.appendLast(node);
        ll.appendLast(node2);
        ll.appendLast(node3);
        ll.toString();

        //using add in beginning
        Node node1 = new Node("0th node");
        ll.addBeginning(node1);
        ll.toString();

        System.out.println(ll.findElement(node3));

        //remove first node
        ll.deleteFirst();
        ll.toString();

        //remove last node
        ll.removeLast();
        ll.toString();

        ll.addBeginning(node1);
        ll.appendLast(node3);
        ll.toString();
        System.out.println(ll.getCount());

        ll.deleteElement(node2);
        ll.toString();

        System.out.println(ll.getCount());
    }
}
