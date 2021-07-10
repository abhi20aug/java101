package com.java101.sec24.generics.part1;

public class Example232_2 {

    public static void main(String[] args) {

        //array of objects
        Object obj[] = new Object[3];

        obj[0] = "Hi";
        obj[1] = "abhishek";
        obj[2] = 10;

        String str;
        //obj[] can store any objectType.
        //No Type safety.

        for (int i = 0; i < 3; i++) {

            str = (String)obj[i];
            System.out.println(str);
            //it will cause a run time error
            //java.lang.Integer cannot be cast to java.lang.String

        }


    }


}
