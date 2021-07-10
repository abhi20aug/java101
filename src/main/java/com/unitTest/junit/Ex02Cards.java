package com.unitTest.junit;

import java.util.HashSet;

public class Ex02Cards {

    HashSet<String> suits = new HashSet<>();

    //constructor adds the attributes
    public Ex02Cards() {
        suits.add("hearts");
        suits.add("diamonds");
        suits.add("clubs");
        suits.add("spades");
    }

    public boolean isSuit(String suit){
        return suits.contains(suit);
    }
}
