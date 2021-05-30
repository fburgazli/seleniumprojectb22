package com.cybertek.tests.day4_cssSelector_xPath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3_PracticeCybertekForgotPasswordURLVerification {
//todo: try this soon
public static void main(String[] args) {


//    1. Open Chrome browser
    //WebDriverManager.chromedriver().setup();
    //WebDriver driver = new ChromeDriver();

    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

//    2. Go to http://practice.cybertekschool.com/forgot_password
    driver.get("http://practice.cybertekschool.com/forgot_password");

//    3. Enter any email into input box
    WebElement inputEmailBox = driver.findElement(By.name("email"));
    inputEmailBox.sendKeys("abc_123@mail.com");

//    4. Click on Retrieve password
    driver.findElement(By.id("form_submit")).click();
//    5. Verify URL contains:
   // Expected: “email_sent”
    String expectedInUrl = "email_sent";
    String actualUrl = driver.getCurrentUrl();
    if(actualUrl.contains(expectedInUrl)){
        System.out.println("Url verification PASSED");
    }else{
        System.out.println("Url verification FAILED");

    }
//
//    6. Verify textbox displayed the content as expected.
//        Expected: “Your e-mail’s been sent!”
       // driver.findElement(By.cssSelector("all")).isDisplayed();
}
}
