package com.java101.sec08.loops.examples;

public class FactorialN {
    public static void main(String[] args) {

        int fact = 1;
        int n = 5;

        if (n < 2){
            fact = 1;
        } else {
            for (int i = n; i > 1; i--) {
                //            fact_n = fact_n-1*(n-1);
                //                   = n*n-1*n-2*....3*2*1;
                fact = fact * i;
            }
        }

        System.out.println(fact);
    }
}
