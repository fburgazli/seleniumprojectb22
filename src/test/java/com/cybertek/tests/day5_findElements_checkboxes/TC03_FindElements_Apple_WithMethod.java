package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC03_FindElements_Apple_WithMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.apple.com");

        //Click to all of the headers one by one

       List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
        for (int eachLink = 1 ; eachLink < headerLinks.size()-1 ; eachLink++) {
            //System.out.println(headerLinks.get(eachLink).getText());
            headerLinks.get(eachLink).click();
            Thread.sleep(1000);

            System.out.println("Title of the current page : " + driver.getTitle());

            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

            System.out.println("Total number of links in current page : " + allLinks.size());

            int linksWithNoText =0 ;
            int linksWithText = 0;

            for (WebElement each : allLinks) {
                if(each.getText().isEmpty()){
                    linksWithNoText++;
                } else {
                    linksWithText++;
                }
            }
            Thread.sleep(3000);
            System.out.println("Links With Text in current page  = " + linksWithText);
            System.out.println("Links With No Text in current page = " + linksWithNoText);
            System.out.println();

            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        }
        driver.close();


    }


}