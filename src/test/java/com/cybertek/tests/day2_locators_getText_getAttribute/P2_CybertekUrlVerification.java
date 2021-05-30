package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

        String actualUrl = driver.getCurrentUrl();
        String expectedInUrl = "cybertekschool";

        if(actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification: PASSED!");
        }else{
            System.out.println("URL verification: FAILED!!!");
        }

        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification: PASSED!");
        }else{
            System.out.println("Title verification: FAILED!!!");
        }



    }
}
