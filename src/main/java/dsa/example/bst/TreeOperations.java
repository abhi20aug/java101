package dsa.example.bst;

import java.util.List;
import java.util.ListIterator;

public class TreeOperations {
    static boolean getKeyRecursive(Node root, int key) {
        if (root == null)
            return false;
        if (root.getData() == key) {
            System.out.println("tracing... at " + root.getData());
            return true;
        } else if (key > root.getData()) {
            System.out.println("tracing... at " + root.getData());
            return getKeyRecursive(root.getRight(), key);
        } else {
            System.out.println("tracing... at " + root.getData());
            return getKeyRecursive(root.getLeft(), key);
        }

    }

    static boolean getKeyIterative(Node root, int key) {
        Node t = root;
        while (t != null) {
            if (t.getData() == key) {
                System.out.println("tracing... at " + t.getData());
                return true;
            } else if (key > t.getData()) {
                System.out.println("tracing... at " + t.getData());
                t = t.getRight();
            } else {
                System.out.println("tracing... at " + t.getData());
                t = t.getLeft();
            }
        }
        return false;
    }

    static Node insertKey(Node root, int key) {
        Node tail = root, t = root;
        while (t != null) {
            if (t.getData() == key) {
                System.out.println("tracing... at " + t.getData());
                return t;
            } else if (key > t.getData()) {
                System.out.println("tracing... at " + t.getData());
                tail = t;
                t = t.getRight();
            } else {
                System.out.println("tracing... at " + t.getData());
                tail = t;
                t = t.getLeft();
            }
        }

        //t is the position where key should be inserted
        //but t is null
        //we need to have a tail pointer
        System.out.println("tail pointer " + tail.getData());

        if (key < tail.getData()) {
            Node node = new Node();
            node.setData(key);
            tail.setLeft(node);
            return tail;
        } else {
            Node node = new Node();
            node.setData(key);
            tail.setRight(node);
            return tail;
        }

    }

    static Node insertRecursive(Node root, int key) {
        if (root == null) {
            System.out.println("tracing... at " + root.getData());
            Node newNode = new Node();
            newNode.setData(key);
            return newNode;
        }

        if (root.getData() == key) {
            System.out.println("tracing... at " + root.getData());
            return root;
        } else if (key < root.getData()) {
            System.out.println("tracing... at left: " + root.getData());
            root.setLeft(insertRecursive(root.getLeft(), key));
        } else {
            System.out.println("tracing... at right: " + root.getData());
            root.setRight(insertRecursive(root.getRight(), key));
        }
        return root;
    }

    static Node create(List<Integer> list) {

        //create root node
        Node root = new Node();

        for (int element : list) {
            insertKey(root, element);
        }

        return root;
    }


}

