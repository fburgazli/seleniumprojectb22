package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowPractice {
//    TC	#	:	Window	Handle practice

//2. Create	new	test	and	make	set	ups
//3. Go	to	:	http://practice.cybertekschool.com/windows

    WebDriver driver;
    @BeforeClass
    public void setupClass() {
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to: http://practice.cybertekschool.com/iframe
        driver.get("http://practice.cybertekschool.com/windows");

    }
    @Test
    public void windowTest(){
        //4. Assert:	Title	is	“Practice”
        String actualTitleBeforeClick = driver.getTitle();
        String expectedTitleBeforeClick = "Practice";
        Assert.assertEquals(actualTitleBeforeClick,expectedTitleBeforeClick);

        //5. Click	to:	“Click	Here” text
        WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
        clickHereButton.click();
        //6. Switch	to	new	Window.
        for(String eachHandle : driver.getWindowHandles()) {

                driver.switchTo().window(eachHandle);
        }
        //7. Assert:	Title	is	“New	Window”
        String expectedTitleAfterClick = "New Window";
        String actualTitleAfterClick = driver.getTitle();
        Assert.assertEquals(actualTitleAfterClick,expectedTitleAfterClick);

    }

}
