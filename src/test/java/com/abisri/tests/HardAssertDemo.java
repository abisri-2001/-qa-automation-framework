package com.abisri.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo {

    @Test
    public void demo() {

        System.out.println("Step 1");

        Assert.assertEquals(10, 20);

        System.out.println("Step 2");

        System.out.println("Step 3");

    }
}