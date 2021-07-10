package com.unitTest.junit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Ex02CardsTest {

    Ex02Cards cards =  new Ex02Cards();

    @Test
    public void testIfSuit(){
        Assert.assertTrue(cards.isSuit("hearts"));
        Assert.assertFalse(cards.isSuit("zero"));
    }

}
