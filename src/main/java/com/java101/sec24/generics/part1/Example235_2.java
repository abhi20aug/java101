package com.java101.sec24.generics.part1;

public class Example235_2 {

    //bound Types
    static <E extends Number> void show(E[] list){
        for (E x:list) {
            System.out.println("Element "+x);
        }
    }

    static <E extends Number> void showVar(E...list){
        for (E x:list) {
            System.out.println("Element "+x);
        }
    }

    static void showSimpleVar(int ... list){
        for (int x:list) {
            System.out.println("Element "+x);
        }
    }

    public static void main(String[] args) {

        //show(new String[]{"Hi","abhi","arr1","arr2"});
        show(new Integer[]{1,2,3,4,5});
        show(new Float[]{1.1f,2f,3f,4f,5f});
        show(new Double[]{1.1,2.1,3.1,4.1,5.1});
        //show(new Object[]{"Hi",10,"see"});

        //variable argument passing
        //showVar("Hi", "abhi", "arr1", "arr2");
        showVar(1,2,3,4,5);

        showSimpleVar(1,2,3,4,5,6,7);
    }


}
