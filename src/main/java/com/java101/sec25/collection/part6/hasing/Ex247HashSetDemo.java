package com.java101.sec25.collection.part6.hasing;

import java.util.HashSet;

public class Ex247HashSetDemo {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hsLF = new HashSet(20,0.75f);
        hs.add(10);
        hs.add(20);
        hs.add(30);

        hs.forEach(x->{
            System.out.println(x);
        });



    }

}
