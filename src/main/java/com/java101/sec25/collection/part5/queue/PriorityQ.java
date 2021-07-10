package com.java101.sec25.collection.part5.queue;

import java.util.Comparator;
import java.util.PriorityQueue;


class MyCom implements Comparator<Integer>{

    @Override
    public int compare(Integer t1, Integer t2) {
        if (t1< t2) return 1;
        return 0;
    }
}

public class PriorityQ {


    //heap, implemented as Array

    //array/heap/binaryTree
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue(new MyCom());
        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(5);
        priorityQueue.add(15);
        priorityQueue.add(3);

        //peek get head element
        //poll remove head element

        priorityQueue.forEach(x->{
            System.out.println(x);
        });

        priorityQueue.poll();
        System.out.println("**************");
        priorityQueue.forEach(x->{
            System.out.println(x);
        });



    }

}
