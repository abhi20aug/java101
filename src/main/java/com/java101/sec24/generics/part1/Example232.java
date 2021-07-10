package com.java101.sec24.generics.part1;

public class Example232 {

    public static void main(String[] args) {

        //object of super class can hold object of any class
        Object obj = new String("abhishek");
        obj = new Integer(10);
        String str = (String)obj;

        //obj ref can hold anything
        //when you want it back, then typecast it.
        //type is checked at run time.

        //object can be used for generalization.
        //type casting is needed.
        //
    }

}
