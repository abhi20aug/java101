package com.java101.sec25.collection.part4.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ExLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);

        LinkedList<Integer> ll2 = new LinkedList<>();
        ll.addFirst(70);
        ll.addLast(90);
        ll.removeFirst();
        ll.removeLast();

        ListIterator<Integer> li = ll.listIterator();
        for(;li.hasNext();){
            System.out.print(li.next()+",");
        }

        System.out.println(
        "\nll.poll: "+ll.poll()+
        "\nll.poll: "+ll.poll()+
        "\nll.poll: "+ll.poll()+
        "\nll.isEmpty: "+ll.isEmpty()
//        "\nll.peek: "+ll.peek()
//        "\nll.pollFirst: "+ ll.pollFirst()+
//        "\nll.pollLast:"+ ll.pollLast()+
//        "\nll.pollFirst:"+ ll.pollFirst()+
//        "\nll.peekLast:"+ll.peekLast()
        );
//
//
//        System.out.println("\nLoop LL:");
//        for (int i = 0; i < ll.size(); i++) {
//            System.out.print(ll.get(i)+",");
//        }
//        System.out.println("\nFirst"+ll.getFirst());
//        System.out.println("\nLast"+ll.getLast());

    }

}
