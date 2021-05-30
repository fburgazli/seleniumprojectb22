package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementsPractice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //We need to create a locator that returns us all the links on the page
        //body//a --> this locator will return all of the links on the page
        List<WebElement> listOfLinks= driver.findElements(By.xpath("//body//a"));
        //3. Print out the texts of all links
        //iter+tab ==> shortcut for foreach loop
        for(WebElement each:listOfLinks) {
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }

        //4. Print out how many total link
        int numberOfLinks = listOfLinks.size();
        System.out.println("numberOfLinks = " + numberOfLinks);
    }
}