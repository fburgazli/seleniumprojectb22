package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTask_2_AttributeVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //Locate the link and store inside a webelement

        WebElement zeroBankLink = driver.findElement(By.className("brand"));

        //3. Verify link text from top left:
        // Expected: “Zero Bank”
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();
        if(actualLinkText.equals(expectedLinkText)){
            System.out.println("Link text verification PASSED!");
        }else{
            System.out.println("Link text verification FAILED!");
        }

        //4. Verify link href attribute value contains:
        // Expected: “index.html”
        String expectedInLinkAttribute = "index.html";
        String actualLinkAttribute = zeroBankLink.getAttribute("href");
        if(actualLinkAttribute.contains(expectedInLinkAttribute)){
            System.out.println("Link attribute verification PASSED!");
        }else{
            System.out.println("Link attribute verification FAILED!!!");

        }
    }
}
