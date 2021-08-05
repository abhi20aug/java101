package com.java101.sec08.loops;

import java.util.ArrayList;

public class WhileLoop {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Loop");
        al.add("while Loop");
        al.add("do while loop");
        al.add("for Loop");
        al.add("for each loop");
        al.add("iterators");

        System.out.println("running 1st time");
        int i =0;
        while (!al.isEmpty()){
            System.out.println(al.get(i));
            al.remove(i);
        }
        System.out.println(al);

        System.out.println("running 2nd time");
        int j =0;
        while (!al.isEmpty()){
            System.out.println(al.get(j));
            al.remove(j);
        }
    }

}
