package com.abisri.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    private WebDriver driver;

    private By dashboardHeading =
            By.xpath("//h6[text()='Dashboard']");

    private By userDropdown =
            By.className("oxd-userdropdown-name");

    private By logoutLink =
            By.xpath("//a[text()='Logout']");

    public DashboardPage(WebDriver driver) {

        this.driver = driver;
    }

    public boolean isDashboardDisplayed() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(dashboardHeading)
        ).isDisplayed();
    }

    public void clickUserDropdown() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.elementToBeClickable(userDropdown)
        ).click();
    }

    public void clickLogout() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.elementToBeClickable(logoutLink)
        ).click();
    }
}