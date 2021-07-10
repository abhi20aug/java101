package com.java101.sec25.collection.part7.tree;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ex248TreeSetDemo {


    //elements will be sorted, logN time
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        //using interfaces
        Collection<Integer> cts = new TreeSet<>();
        SortedSet<Integer> sts = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);

        System.out.println(treeSet);

        treeSet.add(50);
        System.out.println(treeSet);
        System.out.println(treeSet.ceiling(49));
        //treeSet.contains()
        treeSet.first();



    }

}
