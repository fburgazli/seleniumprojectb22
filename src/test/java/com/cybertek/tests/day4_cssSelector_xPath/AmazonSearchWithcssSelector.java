package com.cybertek.tests.day4_cssSelector_xPath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchWithcssSelector {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement amazonSearchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox")) ;
        //WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        //WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[type='text']"));
        //WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[name='field-keywords']"));
        amazonSearchBar.sendKeys("wooden spoon" + Keys.ENTER);

        String expectedInTitle = "wooden spoon";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }

    }
}
