package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

        String expectedUrl = "cybertekschool";
        String expectedTitle="Practice";
        String actualUrl = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Url contains expected Url. PASSED!");
        }else{
            System.out.println("Url does not contain expected url.FAILED!!!");
        }
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title as expected.PASSED!");
        }else{
            System.out.println("Title is not as expected.FAILED!!!");
        }

        driver.close();

    }
}
