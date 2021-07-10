package com.unitTest.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex03RectangleTest {

    Ex03Rectangle rec = new Ex03Rectangle();

    @Test
    public void isSquareTest(){
        boolean actual = rec.isSquare(2,2);
        Assertions.assertEquals(true, actual);

        boolean actual2 = rec.isSquare(2,3);
        Assertions.assertEquals(false, actual2);
    }
}
