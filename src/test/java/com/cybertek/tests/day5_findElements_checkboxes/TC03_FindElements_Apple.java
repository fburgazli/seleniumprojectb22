package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC03_FindElements_Apple {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.apple.com");

    //Click to all of the headers one by one
        // a.Mac,
        WebElement macButton = driver.findElement(By.xpath("//li[@class='ac-gn-item ac-gn-item-menu ac-gn-mac']/a"));
        macButton.click();
        List<WebElement> macLinks = driver.findElements(By.xpath("//a"));
        int countMac=0;
        for (WebElement link : macLinks) {

            if(link.getText().isEmpty()){
                countMac++;
                continue;
            }

        }
        System.out.println("The title of the Mac page = "+driver.getTitle());
        System.out.println("Total number of links in Mac page = "+ macLinks.size());
        System.out.println("Mac page links without text = "+ countMac);
        System.out.println("Mac page links with text = " + (macLinks.size()-countMac));
        System.out.println("=======================================================");
        // iPad,
        WebElement iPadButton = driver.findElement(By.xpath("//li[@class='ac-gn-item ac-gn-item-menu ac-gn-ipad']/a"));
        iPadButton.click();
        List<WebElement> iPadLinks = driver.findElements(By.xpath("//a"));
        int countIPad=0;
        for (WebElement link : iPadLinks) {

            if(link.getText().isEmpty()){
                countIPad++;
                continue;
            }
        }
        System.out.println("The title of the iPad page = "+driver.getTitle());
        System.out.println("Total number of links in iPad page = "+ iPadLinks.size());
        System.out.println("Links without text = "+ countIPad);
        System.out.println("Links with text = " + (iPadLinks.size()-countIPad));
        System.out.println("=======================================================");

        // iPhone,
        WebElement iPhoneButton = driver.findElement(By.xpath("//li[@class='ac-gn-item ac-gn-item-menu ac-gn-iphone']/a"));
        iPhoneButton.click();
        List<WebElement> iPhoneLinks = driver.findElements(By.xpath("//a"));
        int countIPhone=0;
        for (WebElement link : iPhoneLinks) {

            if(link.getText().isEmpty()){
                countIPhone++;
                continue;
            }
        }
        System.out.println("The title of the iPhone page = "+driver.getTitle());
        System.out.println("Total number of links in iPhone page = "+ iPhoneLinks.size());
        System.out.println("Links without text = "+ countIPhone);
        System.out.println("Links with text = " + (iPhoneLinks.size()-countIPhone));
        System.out.println("=======================================================");

        // Watch,
        WebElement watchButton = driver.findElement(By.xpath("//li[@class='ac-gn-item ac-gn-item-menu ac-gn-watch']/a"));
        watchButton.click();
        List<WebElement> watchLinks = driver.findElements(By.xpath("//a"));
        int countWatch=0;
        for (WebElement link : watchLinks) {

            if(link.getText().isEmpty()){
                countWatch++;
                continue;
            }
        }
        System.out.println("The title of the Watch page = "+driver.getTitle());
        System.out.println("Total number of links in Watch page = "+ watchLinks.size());
        System.out.println("Links without text = "+ countWatch);
        System.out.println("Links with text = " + (watchLinks.size()-countWatch));
        System.out.println("=======================================================");

        // TV,
        WebElement tvButton = driver.findElement(By.xpath("//li[@class='ac-gn-item ac-gn-item-menu ac-gn-tv']/a"));
        tvButton.click();
        List<WebElement> tvLinks = driver.findElements(By.xpath("//a"));
        int countTv=0;
        for (WebElement link : tvLinks) {

            if(link.getText().isEmpty()){
                countTv++;
                continue;
            }
        }
        System.out.println("The title of the TV page = "+driver.getTitle());
        System.out.println("Total number of links in TV page = "+ tvLinks.size());
        System.out.println("Links without text = "+ countTv);
        System.out.println("Links with text = " + (tvLinks.size()-countTv));
        System.out.println("=======================================================");

        // Music,
        WebElement musicButton = driver.findElement(By.xpath("//li[@class='ac-gn-item ac-gn-item-menu ac-gn-music']/a"));
        musicButton.click();
        List<WebElement> musicLinks = driver.findElements(By.xpath("//a"));
        int countMusic=0;
        for (WebElement link : musicLinks) {

            if(link.getText().isEmpty()){
                countMusic++;
                continue;
            }
        }
        System.out.println("The title of the Music page = "+driver.getTitle());
        System.out.println("Total number of links in Music page = "+ musicLinks.size());
        System.out.println("Links without text = "+ countMusic);
        System.out.println("Links with text = " + (musicLinks.size()-countMusic));
        System.out.println("=======================================================");

        // Support
        WebElement supportButton = driver.findElement(By.xpath("//li[@class='ac-gn-item ac-gn-item-menu ac-gn-support']/a"));
        supportButton.click();
        List<WebElement> supportLinks = driver.findElements(By.xpath("//a"));
        int countSupport=0;
        for (WebElement link : supportLinks) {

            if(link.getText().isEmpty()){
                countSupport++;
                continue;
            }
        }
        System.out.println("The title of the Support page = "+driver.getTitle());
        System.out.println("Total number of links in Support page = "+ supportLinks.size());
        System.out.println("Links without text = "+ countSupport);
        System.out.println("Links with text = " + (supportLinks.size()-countSupport));
        System.out.println("=====================END===========================");

    }
}
