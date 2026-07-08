package com.abisri.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.abisri.base.BaseClass;
import com.abisri.pages.DashboardPage;
import com.abisri.pages.LoginPage;

public class LogoutTest extends BaseClass {

    @Test
    public void logoutTest() {

        LoginPage loginPage =
                new LoginPage(driver);

        DashboardPage dashboardPage =
                new DashboardPage(driver);

        loginPage.enterUsername("Admin");

        loginPage.enterPassword("admin123");

        loginPage.clickLogin();

        Assert.assertTrue(
                dashboardPage.isDashboardDisplayed(),
                "Dashboard is not displayed after login"
        );

        dashboardPage.clickUserDropdown();

        dashboardPage.clickLogout();

        Assert.assertTrue(
                loginPage.isLoginPageDisplayed(),
                "Login page is not displayed after logout"
        );
    }
}