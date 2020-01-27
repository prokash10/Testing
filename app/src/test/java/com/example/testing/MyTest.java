package com.example.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyTest {
    Arithmetic arithmetic=new Arithmetic();
    @Before
    public void setUp()
    {
        arithmetic=new Arithmetic();
    }
    @Test
    public void tstAddition()
    {

        float expectedResult=10;
        float actualResult=arithmetic.add(4,6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSubtraction()
    {

        float expectedResult=2;
        float actualResult=arithmetic.subtract(6,4);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDivide()
    {

        float expectedResult=5;
        float actualResult=arithmetic.divide(10,2);
        assertEquals(expectedResult,actualResult);
    }

    @After
    public void testDown()
    {
        arithmetic=null;
    }
}
