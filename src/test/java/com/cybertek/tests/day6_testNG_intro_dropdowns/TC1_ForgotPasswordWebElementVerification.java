package com.cybertek.tests.day6_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC1_ForgotPasswordWebElementVerification {
    public static void main(String[] args) {
        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3. Locate all the WebElements on the page using XPATH locator only (total of 6)
            // a. “Home” link
        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));
            // b. “Forgot password” header
        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//div/h2"));
            // c. “E-mail” text
        WebElement eMailText = driver.findElement(By.xpath("//label[@for='email']"));
        // d. E-mail input box
        WebElement eMailInputBox = driver.findElement(By.xpath("//input[contains(@name , 'email')]"));
        // e. “Retrieve password” button
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button/i"));
        // f. “Powered by Cybertek School” text
        WebElement poweredByCybertekSchoolText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        // 4. Verify all WebElements are displayed.
        System.out.println( homeLink.getText() +" is displayed ? --> "+ homeLink.isDisplayed());
        System.out.println(forgotPasswordHeader.getText()+" is displayed ? --> "+forgotPasswordHeader.isDisplayed());
        System.out.println(eMailText.getText()+" is displayed ? --> "+eMailText.isDisplayed());
        System.out.println(eMailInputBox.getText()+"E-mail input box is displayed ? --> "+eMailInputBox.isDisplayed());
        System.out.println(retrievePasswordButton.getText()+" is displayed ? --> "+retrievePasswordButton.isDisplayed());
        System.out.println(poweredByCybertekSchoolText.getText()+" is displayed ? --> "+poweredByCybertekSchoolText.isDisplayed());

        driver.close();
    }
}
