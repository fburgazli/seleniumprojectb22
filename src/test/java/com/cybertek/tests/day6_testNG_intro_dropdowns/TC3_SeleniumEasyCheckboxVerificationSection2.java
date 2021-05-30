package com.cybertek.tests.day6_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC3_SeleniumEasyCheckboxVerificationSection2 {

    @Test

    public void tc3() throws InterruptedException {
        //TC #3: SeleniumEasy Checkbox Verification –Section 2

       // 1.Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        //3.Verify “Check All” button text is “Check All”

        WebElement checkAllButton = driver.findElement(By.id("check1"));
        //System.out.println(checkAllButton.getText());

        Assert.assertEquals(checkAllButton.getAttribute("value"), "Check All");

        //4.Click to “Check All” button

        checkAllButton.click();

        //5. Verify all check boxes are checked
        List<WebElement> optionsText = driver.findElements(By.xpath("//label"));
        List<WebElement> options = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for(int i=1,j=0;i<optionsText.size();i++,j++) {

                //Thread.sleep(3000);
                System.out.println(optionsText.get(i).getText() + " is selected " + options.get(j).isSelected());

        }

        //6.Verify button text changed to “Uncheck All”
        WebElement unCheckAllButton = driver.findElement(By.xpath("//input[@value='Uncheck All']"));

        Assert.assertEquals(unCheckAllButton.getAttribute("value"), "Uncheck All");

        driver.close();
    }
}
