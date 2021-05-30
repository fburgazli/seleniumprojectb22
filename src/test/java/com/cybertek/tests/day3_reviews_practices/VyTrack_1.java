package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrack_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa3.vytrack.com/user/login");
        driver.findElement(By.name("_username")).sendKeys("storemanager81");
        driver.findElement(By.name("_password")).sendKeys("UserUser123"+ Keys.ENTER );
       // driver.findElement(By.id("_submit")).click();

        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Login successful!");
        }else{
            System.out.println("Login FAILED!");
        }
    }
}
