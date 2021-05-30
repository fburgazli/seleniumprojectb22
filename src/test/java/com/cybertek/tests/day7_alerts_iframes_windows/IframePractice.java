package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
//TC #4 : Iframe practice
//1. Create a new class called: IframePractice

//2. Create new test and make set ups
    WebDriver driver;
@BeforeClass
public void setupClass() {
    // 1. Open Chrome browser
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // 2. Go to: http://practice.cybertekschool.com/iframe
    driver.get("http://practice.cybertekschool.com/iframe");

}

    @Test
    public void iFrameTest(){
    //3.Assert: “Your content goes here.” Text is displayed.
       //First way to switch to iframe
        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);

        //Second way to switch to iframe
        //driver.switchTo().frame(0);

        //Third way to switch to iframe is passing id/name attribute value if <iframe> tag has one:
        //driver.switchTo().frame("mce_0_ifr");
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

    //4.Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
       // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        String headerText = driver.findElement(By.xpath("//h3")).getText();
        String expectedHeaderText = "An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(headerText,expectedHeaderText);

    }

    @AfterClass
    public void teardownClass(){
        driver.close();
    }

}
