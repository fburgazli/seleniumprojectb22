package com.cybertek.tests.day6_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC3_SelectingDateOnDropdownAndVerifying {

    @Test
    public void tc3(){
       // TC #3: Selecting date on dropdown and verifying

       // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        //3.Select “December 1st, 1922” and verify it is selected.

        //Select year using: visible text

        WebElement year = driver.findElement(By.id("year"));

        Select select = new Select(year);
        select.selectByVisibleText("1992");

        Assert.assertEquals(select.getFirstSelectedOption().getText(), "1992" , "Year selected as expected.");

        //Select month using : value attribute

        WebElement month = driver.findElement(By.id("month"));
        Select select2 = new Select(month);

        select2.selectByValue("11");

        Assert.assertEquals(select2.getFirstSelectedOption().getText(), "December" ,"month selected as expected.");

        //Select day using: index number

        WebElement day = driver.findElement(By.id("day"));
        Select select3 = new Select(day);

        select3.selectByIndex(0);
        Assert.assertEquals(select3.getFirstSelectedOption().getText(), "1","Day selected as expected.");

        driver.close();
    }
}
