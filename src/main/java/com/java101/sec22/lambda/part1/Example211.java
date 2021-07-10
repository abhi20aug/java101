package com.java101.sec22.lambda.part1;

interface myInt{
    void display(String param1);
}

public class Example211 {

    public static void main(String[] args) {

        myInt mi = (s)->{
            System.out.println("param pass in lambda expression: "+s);
        };
        mi.display("abhishek");
    }
}
