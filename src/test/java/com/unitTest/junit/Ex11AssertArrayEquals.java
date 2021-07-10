package com.unitTest.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex11AssertArrayEquals {

    @Test
    public void intArrayEqualsTest(){
        int[] arrayOne = {1,2,3};
        int[] arrayTwo = {1,2,3};
        Assertions.assertArrayEquals(arrayOne, arrayTwo);
    }

    @Test
    public void strArrayEqualsTest(){
        String[] strArrActual = "ab cd ef".split(" ");
        String[] strArrExpected = {"ab","cd","ef"};
        Assertions.assertArrayEquals(strArrActual, strArrExpected);
        assert true;
    }



}
