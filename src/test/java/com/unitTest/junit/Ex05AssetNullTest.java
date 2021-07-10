package com.unitTest.junit;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex05AssetNullTest {

    @Test
    public void assertNullTest(){

        String a = null;
        Assertions.assertNull(a);

        String b = "hello";
        Assertions.assertNotNull(b);
    }
}
