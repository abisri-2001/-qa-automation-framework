package com.abisri.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.abisri.base.BaseClass;
import com.abisri.listeners.TestListener;
import com.abisri.pages.LoginPage;
import com.abisri.utilities.ExcelReader;
import com.abisri.pages.DashboardPage;

@Listeners(TestListener.class)

public class LoginTest extends BaseClass {

    @DataProvider(name = "loginData")
    public Object[][] getData() throws Exception {

        return ExcelReader.getExcelData();
    }

    @Test(dataProvider = "loginData")
    public void loginTest(
            String username,
            String password,
            String expectedResult) {

        LoginPage loginPage = new LoginPage(driver);

        DashboardPage dashboardPage = new DashboardPage(driver);

        loginPage.enterUsername(username);

        loginPage.enterPassword(password);

        loginPage.clickLogin();

        if (expectedResult.equalsIgnoreCase("Valid")) {

            Assert.assertTrue(
                    dashboardPage.isDashboardDisplayed(),
                    "Expected successful login, but login failed"
            );

        } else {

            Assert.assertTrue(
                    loginPage.isInvalidCredentialsMessageDisplayed(),
                    "Expected invalid login message, but it was not displayed"
            );
        }}}
  