package com.cybertek.tests.self_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BeanBeanBean {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://beanbeanbean.com/times-tables.html");

        WebElement firstNumber = driver.findElement(By.xpath("//p[@id='pFirstNumber']"));
        WebElement secondNumber = driver.findElement(By.xpath("//p[@id='pSecondNumber']"));


        int firstNum = Integer.parseInt(firstNumber.getText());
        int secondNum =Integer.parseInt(secondNumber.getText());
        int answer = firstNum * secondNum;

        //System.out.println("firstNum = " + firstNum);
        //System.out.println("secondNum = " + secondNum);
        //System.out.println("answer = " + answer);

        WebElement answerNumber = driver.findElement(By.xpath("//div[@class='divBlinker']"));
        answerNumber.sendKeys(answer+""+ Keys.ENTER);


    }
}
