package com.cybertek.office_hours;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MoneyGamingTask {

//    REAL JOB INTERVIEW TASK
//        1. Navigate to: https://moneygaming.qa.gameaccount.com/
//        2. Click the JOIN NOW button to open the registration page
//        3. Select a title value from the dropdown
//        4. Enter your first name and surname in the form
//        5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
//        6. Submit the form by clicking the JOIN NOW button
//        7. Validate that a validation message with text ‘ This field is required’ appears under the date of
//        birth box

    @Test
    public void task1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://moneygaming.qa.gameaccount.com/");

        WebElement joinNowButton = driver.findElement(By.xpath("//a[.='Join Now!']"));
        joinNowButton.click();

        WebElement titleButton = driver.findElement(By.xpath("//select[@id='title']"));
        Select select = new Select(titleButton);
        select.selectByVisibleText("Mr");
        WebElement firstName = driver.findElement(By.xpath("//input[@id='forename']"));
        firstName.sendKeys("James");

        WebElement surname = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surname.sendKeys("Bond");

        WebElement termsButton = driver.findElement(By.xpath("//input[@name='map(terms)']"));
        termsButton.click();
        WebElement joinButton = driver.findElement(By.xpath("//input[@alt='Join Now']"));
        joinButton.click();
        Thread.sleep(3000);
        WebElement dob = driver.findElement(By.xpath("//label[@for='dob']"));
        String expected ="This field is required";
        Assert.assertEquals(dob.getText(),expected,"DOB field is required test PASSED!");

    }

}
