package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_FacebookHrefVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        WebElement createAPageLink = driver.findElement(By.linkText("Create a Page"));
        String expectedInHeader = "registration_form";
        String actualHeader = createAPageLink.getAttribute("href");
        //System.out.println("actualHeader = " + actualHeader);
        if(actualHeader.contains(expectedInHeader)){
            System.out.println("Href value verification PASSED!");
        }else{
            System.out.println("Href value verification FAILED!");
        }
    }
}
