package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //setup the browser driver
        WebDriverManager.chromedriver().setup();
        // create instance of selenium web driver
        WebDriver driver = new ChromeDriver();
        //will maximize the browser size
        driver.manage().window().maximize();
        //next line will work for mac only,not for windows
        //driver.manage().window().fullscreen();
        //get the page for
        driver.get("https://www.tesla.com");
        //putting 3 scs of wait/stops the code for 3 scs
        System.out.println("Current title: "+ driver.getTitle());
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //Thread.sleep(3000);
        // going back using navigations
        driver.navigate().back();

       // Thread.sleep(3000);
        //going forward using navigation
        driver.navigate().forward();

        //Thread.sleep(3000);
        //refreshing the page
        driver.navigate().refresh();
        //Thread.sleep(3000);

        // going to another url using .to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title: " + driver.getTitle());
        currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //this method close the current browser tab only.
        driver.close();

        //this method will close all tabs within the same session.
        //driver.quit();





    }
}
