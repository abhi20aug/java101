package com.unitTest.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex04CircleTest {

    Ex04Circle circle = new Ex04Circle(10);

    @Test
    public void getRadiusTest(){
        int expected = 10;
        int actual = circle.getRadius();
        Assertions.assertTrue(expected==actual);
    }

    @Test
    public void getDiameter(){
        int expected = 20;
        int actual = circle.getDiameter();
        Assertions.assertTrue(expected==actual);
    }

    @Test
    public void getCfTest(){
        double expected = 2*3.14*10;
        double actual = circle.getCircumference();
        Assertions.assertTrue(expected==actual);
    }

    @Test
    public void getAreaTest(){
        double expected = 3.14*100;
        double actual = circle.getArea();
        Assertions.assertTrue(expected==actual);
    }

}
