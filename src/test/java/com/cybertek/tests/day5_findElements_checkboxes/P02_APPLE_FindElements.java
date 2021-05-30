package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P02_APPLE_FindElements {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.apple.com");
       WebElement iPhone = driver.findElement(By.xpath("//li[@class='ac-gn-item ac-gn-item-menu ac-gn-iphone']/a"));
       iPhone.click();
       List<WebElement> links = driver.findElements(By.xpath("//a"));
        int count=0;
        for (WebElement link : links) {

            if(link.getText().isEmpty()){
                count++;
                continue;
            }
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        }
        System.out.println("Links without text = "+ count);
        System.out.println("Links with text = " + (links.size()-count));
        System.out.println("All links = " + links.size());
    }
}
