package com.abisri.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {

    @Parameters("browser")
    @Test
    public void launchBrowser(String browser) {

        System.out.println("Browser: " + browser);
    }
}