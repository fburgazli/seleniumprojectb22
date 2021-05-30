package com.cybertek.tests.day6_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC5_SelectingValueFromNonSelectDropdown {

    @Test
    public void tc5(){
       // TC #5: Selecting value from non-select dropdown

        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        //3.Click to non-select dropdown
        WebElement dropdownLink = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        dropdownLink.click();

        //4.Select Facebook from dropdown

        WebElement fbLink = driver.findElement(By.xpath("//a[.='Facebook']"));
        fbLink.click();

        //5. Verify title is “Facebook -Log In or Sign Up”

        Assert.assertEquals(driver.getTitle(),"Facebook - Log In or Sign Up");
    }
}
