package com.unitTest.junit;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex01ArithmeticTest {

    Ex01Arithmetic arth = new Ex01Arithmetic();
//@Test
//public void Syntax(){

// Assert.fail();

// assetEquals(expected, actual) //when True
// assetNotEquals(expected, actual) //whenFalse
// assertTrue(2==1) //will pass
// assetFalse(2==3) //will pass

//}

@Test
public void add1Test(){
    int actual = Ex01Arithmetic.add(1,3);
    int expected = 4;
    Assert.assertEquals(expected,actual);
}

    @Test
    public void add2Test(){
        int actual = Ex01Arithmetic.add(1,0);
        int expected = 1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add3Test(){
        int actual = Ex01Arithmetic.add(1,2);
        int expected = 2;
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void squareTest(){
        int actual[] = {arth.square(2),arth.square(4),arth.square(6),arth.square(8)};
        int expected[] = {4,16,36,64,81};
        Assertions.assertEquals(expected[1],actual[1]);
    }

}


