package com.cybertek.tests.day6_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC2_SeleniumEasyCheckboxVerification_Section1 {

    @Test
    public void tc2(){
        //TC #2: SeleniumEasy CheckboxVerification–Section 1
        //1.Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // 2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

       // 3. Verify “Success –Check box is checked” message is NOT displayed.

        WebElement singleCheckbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        System.out.println("Single Checkbox is selected? -->"+ singleCheckbox.isSelected());

        //4.Click to checkbox under “Single Checkbox Demo” section

        singleCheckbox.click();

        //5.Verify “Success –Check box is checked” message isdisplayed.

        System.out.println("Single Checkbox is selected? -->" + singleCheckbox.isSelected());
    }
}
