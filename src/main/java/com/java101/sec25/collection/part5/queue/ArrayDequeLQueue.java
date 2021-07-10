package com.java101.sec25.collection.part5.queue;

import java.util.ArrayDeque;

public class ArrayDequeLQueue {

    public static void main(String[] args) {

        ArrayDeque<Integer> aq = new ArrayDeque<>();

        aq.offerLast(10);
        aq.offerLast(20);
        aq.offerLast(30);
        aq.offerLast(40);
//        aq.offerFirst(1);
//        aq.offerFirst(2);
//        aq.offerFirst(3);
//        aq.offerFirst(4);

      //stack
      aq.pollLast();


        aq.forEach(n->{
            System.out.println(n);
        });


        //stack
        aq.pollLast();
        aq.forEach(n->{
            System.out.println(n);
        });


        //Queue
        aq.pollFirst();
        aq.forEach(n->{
            System.out.println(n);
        });


    }


}
