package com.example.firstchurchofgodapplication;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonViewRelatedClassUnitTest {
    private NonViewRelatedClass nonViewRelatedClass;

    @Before
    public void setUp () throws Exception {
        nonViewRelatedClass = NonViewRelatedClass.getInstance();
    }

    @Test
    public void checkisDivisibleByGodsLuckyNumber () {
        int number = 19;
        boolean expectedResult = nonViewRelatedClass.isDivisibleByGodsLuckyNumber(number);
        Assert.assertFalse(expectedResult);
    }

    @After
    public void tearDown() throws Exception {
        nonViewRelatedClass = null;
    }
}
