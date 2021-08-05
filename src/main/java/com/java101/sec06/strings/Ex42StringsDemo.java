package com.java101.sec06.strings;

import java.sql.Struct;

public class Ex42StringsDemo {

    public static void main(String[] args) {

        //constructors
        //1. String(char[])
        //2. String(byte[])
        //3. String(String)

        char c[] ={'A','B','C','D'};
        String arrayChar = new String(c);
        System.out.println(arrayChar);
        //ABCD

        byte b[] = {65,66,67,68}; //ASCII Codes of ABCD
        String byteArr = new String(b);
        System.out.println(byteArr);
        //ABCD


    }
}
