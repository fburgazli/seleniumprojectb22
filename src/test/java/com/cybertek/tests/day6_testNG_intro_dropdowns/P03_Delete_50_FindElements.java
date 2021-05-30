package com.cybertek.tests.day6_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_Delete_50_FindElements {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // Click to “Add Element” button 50 times
        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for (int i = 0; i < 50; i++) {
            addElementButton.click();
        }

        // Verify 50 “Delete” button is displayed after clicking.
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//div[@id='elements']/button"));
        System.out.println("Number of Delete buttons = " + deleteButtons.size());
        // 5. Click to “Delete” button.
        for (WebElement each : deleteButtons) {
            each.click();
        }

        // 6. Verify “Delete” button is NOT displayed after clicking.
        deleteButtons = driver.findElements(By.xpath("//div[@id='elements']/button"));
        if(deleteButtons.size()==0){
            System.out.println("All \"DELETE\" buttons deletion verification PASSED!");
        } else {
            System.out.println("All \"DELETE\" buttons deletion verification FAILED!");
        }
        driver.close();
    }
}
