package com.java101.sec25.collection.part3.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterator1 {

    public static void main(String[] args) {
        //Define a arrayList
        ArrayList<Integer> al1 = new ArrayList<>(10);
        //Add some elements
        for (int i = 0; i < 5; i++) {
            al1.add(i * 10);
            //a11.set(i,i*10); issue of rangeSize exception
        }
        System.out.println("Print using for");
        for (int i = 0; i < al1.size(); i++) {
            System.out.print(al1.get(i) + ",");
        }

        System.out.println("\nPrint using forEach");
        for (Integer x : al1) {
            System.out.print(x + ",");
        }

        System.out.println("\nPrint using for -2");
        for (Integer integer : al1) {
            System.out.print(integer+",");
        }

        System.out.println("\nPrint using forEach lambda");
        al1.forEach((x) -> {
            System.out.print(x+",");
        });

        System.out.println("\nPrint using while iterator");
        Iterator<Integer> it = al1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+",");
        }

        System.out.println("\nListIterator usage:");
        ListIterator<Integer> li = al1.listIterator();
        while(li.hasNext()){
            //System.out.println(li.previous()+",");
            System.out.print(li.next()+",");
        }

        System.out.println("\nListIterator for Loop");
        ListIterator<Integer> li2= al1.listIterator();
        for(; li2.hasNext();){
            System.out.print(li2.next()+",");
        }

        System.out.println("\nListIterator example 3");
        for(ListIterator<Integer> li3 = al1.listIterator(); li3.hasNext();){
            System.out.print(li3.next()+",");
        }
        System.out.println("\nlambda example 4");
        al1.forEach(n-> System.out.print(n+","));
        System.out.println("\nlambda example 5");
        al1.forEach(System.out::println);
        System.out.println("\nlambda example 6");
        al1.forEach(n->show(n));
    }

    static void show( int n){
        if (n > 20){
            System.out.println(n);
        }

    }
}
