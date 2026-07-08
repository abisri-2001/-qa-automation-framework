package com.abisri.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class BaseClass {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
    public void captureScreenshot(String testName) throws IOException {

        TakesScreenshot screenshot =
                (TakesScreenshot) driver;

        File source =
                screenshot.getScreenshotAs(OutputType.FILE);

        File screenshotFolder =
                new File("screenshots");

        if (!screenshotFolder.exists()) {

            screenshotFolder.mkdirs();
        }

        File destination =
                new File(screenshotFolder, testName + ".png");

        FileHandler.copy(source, destination);
    
    
    }
} 