package com.cybertek.tests.day4_cssSelector_xPath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XPath_Practice {
    /*
    TC #6: XPATH LOCATOR practice
    1. Open Chrome browser
    2. Go to http://practice.cybertekschool.com/multiple_buttons
    3. Click on Button 1
    4. Verify text displayed is as expected:
    Expected: “Clicked on button one!”
     */
    public static void main(String[] args) {
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //3.Click on Button 1
        //locating using XPATH with "onclick" attribute value with xpath locator
        //First syntax for XPATH :
        //WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        //Second syntax for XPATH :
        // WebElement button1 = driver.findElement(By.xpath("//*[@onclick='button1()']"));
        //Third syntax for XPATH :
        WebElement button1 = driver.findElement(By.xpath("//button[.='Button 1']"));
        //Fourth syntax for XPATH :
        //WebElement button1 = driver.findElement(By.xpath("//*[.='Button 1']"));
        button1.click();

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        String resultText = result.getText();
        String expectedText="Clicked on button one!";
        if(resultText.equals(expectedText)){
            System.out.println("Result text verification PASSED!");
        }else{
            System.out.println("Result text verification FAILED!");
        }

    }
}
