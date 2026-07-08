package com.abisri.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.abisri.utilities.ExcelReader;

public class DataProviderDemo {

    @DataProvider(name = "loginData")
    public Object[][] getData() throws Exception {

        return ExcelReader.getExcelData();
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {

        System.out.println("Username : " + username);

        System.out.println("Password : " + password);

        System.out.println("----------------------");
    }
}