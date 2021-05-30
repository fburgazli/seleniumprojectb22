package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractice {

    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to http:practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    //TC #1: Information alert practice
    @Test
    public void test01(){
       // 3. Click to “Click for JS Alert” button
        WebElement jsAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlertButton.click();
        // 4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // 5. Verify “You successfuly clicked an alert” text is displayed.
        String actualResult = driver.findElement(By.id("result")).getText();
        String expectedText= "You successfuly clicked an alert";
        Assert.assertEquals(actualResult,expectedText);

    }
    //TC #2: Confirmation alert practice
    @Test
    public void test02(){
        //3. Click to “Click for JS Confirm” button
        WebElement jsConfirmButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirmButton.click();
       // 4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // 5. Verify “You clicked: Ok” text is displayed.
        String actualResult = driver.findElement(By.id("result")).getText();
        String expectedText= "You clicked: Ok";
        Assert.assertEquals(actualResult,expectedText);
    }
    //TC #3: Information alert practice
    @Test
    public void test03(){
//        3. Click to “Click for JS Prompt” button
        WebElement jsPromptButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPromptButton.click();
//        4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
//        5. Click to OK button from the alert
        alert.accept();
//        6. Verify “You entered: hello” text is displayed.
        String actualResult = driver.findElement(By.id("result")).getText();
        String expectedText= "You entered: hello";
        Assert.assertEquals(actualResult,expectedText);
    }

    @AfterClass
    public void teardownClass(){
        driver.close();
    }
}
