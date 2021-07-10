package com.java101.sec24.generics.part1;


public class Example232_3<T> {
    T data[] = (T[])new Object[3];
    public static void main(String[] args) {

        //we want to create an array of a generic type
        //what type of data will be stored
        //that we come to know when class is used by client
        //so a type that should make sure we store only same data type in always.

        Example232_3<String> gd = new Example232_3();
         gd.data[0] = "test";
         gd.data[1] = " of";
         gd.data[2] = " generics";

         String s1 = gd.data[0];
            //no compilation error
    }
}
