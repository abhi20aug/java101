package com.java101.sec08.loops;

import java.util.ArrayList;

public class DoWhileLoop {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Loop chapter");
        al.add("while loop : condition is checked before executing ");
        al.add("do while loop : loop is executed once");
        al.add(" for loop");

        System.out.println("No of items in list"+al.size());

        System.out.println("1st iteration");
        int i =0;
        do{
            i++;
            System.out.println(" item "+i + " "+ al.get(0));
            al.remove(0);
        } while (!al.isEmpty());

        System.out.println("No of items in list"+al.size());
        System.out.println("1st iteration i: "+i);

        System.out.println("2nd iteration");
        int j =0;
        do{
            j++;
            if (al.size() != 0) {
                System.out.println(" item " + j + " " + al.get(0));
                al.remove(0);
            }
            if (al.size() == 0) {
                System.out.println(" list is empty");
            }
        } while (!al.isEmpty());

        System.out.println("2nd iteration j"+j);

    }


}
