package com.abisri.tests;

import org.testng.annotations.Test;

public class GroupDemo {

    @Test(groups = "smoke")
    public void loginTest() {

        System.out.println("Login Test");
    }

    @Test(groups = "regression")
    public void searchTest() {

        System.out.println("Search Test");
    }

    @Test(groups = "smoke")
    public void paymentTest() {

        System.out.println("Payment Test");
    }
}