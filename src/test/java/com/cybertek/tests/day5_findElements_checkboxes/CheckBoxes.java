package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxes {
    /*
    Practice:	Cybertek	Checkboxes
    1. Go	to	http://practice.cybertekschool.com/checkboxes
    2. Confirm	checkbox	#1	is	NOT	selected	by	default
    3. Confirm	checkbox	#2	is	SELECTED	by	default.
    4. Click	checkbox	#1	to	select	it.
    5. Click	checkbox	#2	to	deselect	it.
    6. Confirm	checkbox	#1	is	SELECTED.
    7. Confirm	checkbox	#2	is	NOT	selected.
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");

        List<WebElement> listOfCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement each : listOfCheckboxes) {
            System.out.println(each +" = "+each.isSelected());

        }
        for (WebElement each : listOfCheckboxes) {
            each.click();
        }
        for (WebElement each : listOfCheckboxes) {
            System.out.println(each +" = "+each.isSelected());
        }

    driver.close();

    }
}
