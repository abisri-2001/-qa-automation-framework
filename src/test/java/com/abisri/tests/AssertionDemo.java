package com.abisri.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

	 @Test
    public void testAddition() {

        int actual = 15 + 5;

        int expected = 25;

        Assert.assertEquals(actual, expected);

        System.out.println("Assertion Passed");

    }
} 