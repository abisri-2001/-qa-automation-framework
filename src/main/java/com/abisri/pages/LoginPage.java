package com.abisri.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;

    private By usernameField =
            By.name("username");

    private By passwordField =
            By.name("password");

    private By loginButton =
            By.cssSelector("button[type='submit']");

    private By dashboardHeading =
            By.xpath("//h6[text()='Dashboard']");

    private By invalidCredentialsMessage =
            By.xpath("//p[text()='Invalid credentials']");

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void enterUsername(String username) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(usernameField)
        ).sendKeys(username);
    }

    public void enterPassword(String password) {

        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {

        driver.findElement(loginButton).click();
    }

  

    public boolean isInvalidCredentialsMessageDisplayed() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        invalidCredentialsMessage)
        ).isDisplayed();
    }

    public boolean isLoginPageDisplayed() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(usernameField)
        ).isDisplayed();
    }
}