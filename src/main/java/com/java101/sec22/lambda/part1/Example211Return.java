package com.java101.sec22.lambda.part1;

interface MyInt{
    int add(int x, int y);
}

public class Example211Return {

    public static void main(String[] args) {
        MyInt mi = (a,b)->{
            return a+b;
        };
        int r= mi.add(1,2);
        System.out.println("add: "+r);
    }


}
