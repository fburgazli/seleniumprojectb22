package com.cybertek.tests.day6_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC2_SelectingStateFromStateDropdownAndVerifyingResult {

    @Test
    public void tc2(){

       // TC #2: Selecting state from State dropdown and verifying result
       // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement stateSelection = driver.findElement(By.xpath("//select[@id='state']"));

        Select select = new Select(stateSelection);

        //***Use all Select options.(visible text, value, index)
        //3.Select Illinois
        select.selectByVisibleText("Illinois");

       // 4.Select Virginia
        select.selectByValue("VA");

       // 5.Select California
        select.selectByIndex(5);

        //6. Verify final selected option is California.
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "California","State selected as CA.");

    }
}
