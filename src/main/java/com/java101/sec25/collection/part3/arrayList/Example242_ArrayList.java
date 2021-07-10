package com.java101.sec25.collection.part3.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Example242_ArrayList {

    public static void main(String[] args) {

    //mention type
    ArrayList<Integer> al1 = new ArrayList<>(20);
    al1.add(10);
    al1.add(0,5);

    ArrayList<Integer> al2 = new ArrayList<>(4);
        al2.add(20);
        al2.add(0,25);
    al1.addAll(0,al2);

        System.out.println(al1);
        System.out.println(al2);

        System.out.println(al1.get(0));
        System.out.println(al1.indexOf(5));
        al1.add(4,80);
        al1.add(5,80);
        al1.set(0,50);
        System.out.println(al1);

    }

}
