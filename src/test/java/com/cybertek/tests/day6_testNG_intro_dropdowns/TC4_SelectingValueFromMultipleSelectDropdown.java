package com.cybertek.tests.day6_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC4_SelectingValueFromMultipleSelectDropdown {
    @Test
    public void tc4() throws InterruptedException {
       // TC #4: Selecting value from multiple select dropdown

       // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
        //3.Select all the options from multiple select dropdown.

        WebElement languages = driver.findElement(By.xpath("//select[@name='Languages']"));
        Select select = new Select(languages);

        for(WebElement each : select.getOptions()){

            select.selectByVisibleText(each.getText());

        }
      //  Thread.sleep(3000);
        //4.Print out all selected values.

        for(WebElement each : select.getAllSelectedOptions()){

            System.out.println(each.getText());

        }

        //5.Deselect all values.

        for(WebElement each : select.getOptions()){

            select.deselectByVisibleText(each.getText());

        }

        driver.close();

    }
}
