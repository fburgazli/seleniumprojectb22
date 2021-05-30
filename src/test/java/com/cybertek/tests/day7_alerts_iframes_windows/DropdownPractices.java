package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to http:practice.cybertekschool.com/dropdown
        driver.get("http:practice.cybertekschool.com/dropdown");
    }

    @Test
    public void simpleDropdownTest() {
        //3. Verify “Simple dropdown”default selected value is correct
        //Expected: “Please select an option”

        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
        WebElement currentlySelectedOption =simpleDropdown.getFirstSelectedOption();
        String actualTextOfCurrentOption = currentlySelectedOption.getText();
        String expectedText = "Please select an option";

        Assert.assertTrue(actualTextOfCurrentOption.equals(expectedText));


        //Doing everything in one line is not encouraged!
        //Assert.assertEquals(simpleDropdown.getFirstSelectedOption().getText(), "Please select an option");
    }

    @Test
    public void stateDropdownTest() {
        // 4. Verify“State selection”default selected value is correct
        // Expected: “Select a State”

        Select stateDropdown = new Select(driver.findElement(By.id("state")));

        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateDropdownText = "Select a State";
        Assert.assertEquals(actualStateDropdownText, expectedStateDropdownText);
    }

    @Test
    public void selectingStateFromStateDropdownAndVerifyingResult(){

        // TC #2: Selecting state from State dropdown and verifying result

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //***Use all Select options.(visible text, value, index)
        //3.Select Illinois
        stateDropdown.selectByVisibleText("Illinois");

        // 4.Select Virginia
        stateDropdown.selectByValue("VA");

        // 5.Select California
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        String actualText = stateDropdown.getFirstSelectedOption().getText();
        String expectedText = "California";
        Assert.assertEquals(actualText, actualText);
    }

    @AfterClass
    public void teardownClass(){
        driver.close();
    }
}
