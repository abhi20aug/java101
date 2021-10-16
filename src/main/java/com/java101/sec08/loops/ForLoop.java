package com.java101.sec08.loops;


// you know counter
public class ForLoop {
    public static void main(String[] args) {

        //How many spoon of sugar
            // put it and mix it
            // taste
            // while loop

        //when you know 5 spoons
        for (int i =0; i < 10; i++){
            System.out.println(i);
        }

        for (int i =0; i < 10; ){
            System.out.println(i);
            i++;
        }

        int j =0;
        for (; j < 10; ){
            System.out.println(j);
            j++;
        }

        for (int p =0, q=1; (p< 10 && q < 10); p++, q= q*2){
            System.out.println("p"+p);
            System.out.println("q"+q);
        }

        int k =0;
        for (; ; ){
            System.out.println(k);
            k++;
            if (k > 10){
                return;
            }
        }



    }
}
