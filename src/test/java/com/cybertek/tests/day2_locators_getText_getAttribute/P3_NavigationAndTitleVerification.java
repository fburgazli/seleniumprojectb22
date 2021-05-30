package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    /*
    TC #3: Back and forth navigation
     */
    public static void main(String[] args) {
        //SETUP DRIVER
        WebDriverManager.chromedriver().setup();
        //1- Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://google.com
        driver.get("https://www.google.com/");
        //3- Click to Gmail from top right.
        driver.findElement(By.linkText("Gmail")).click();
        //driver.findElement(By.partialLinkText("mail")).click();

        //4- Verify title contains:
        //Expected: Gmail
        String expectedInTitle= "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Title verification: PASSED!");
        }else{
            System.out.println("Title verification: FAILED!!!");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle= driver.getTitle();

        if (actualGoogleTitle.contains(expectedInTitle)) {
            System.out.println("Title verification AfterNavigateBack: PASSED!");
        }else{
            System.out.println("Title verification AfterNavigateBack: FAILED!!!");
        }

    }
}
