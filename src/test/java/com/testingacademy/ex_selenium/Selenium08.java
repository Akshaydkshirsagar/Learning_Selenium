package com.testingacademy.ex_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium08 {

    @Test

    public void test01(){

        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.wikipedia.org/");
         String ExpectedTitle = "Wikipedia";
         String actualTitle = driver.getTitle();
         Assert.assertEquals(ExpectedTitle, actualTitle,"Wikipedia");

         //class="central-textlogo__image sprite svg-Wikipedia_wordmark"

        WebElement icon= driver.findElement(By.className("central-textlogo__image sprite svg-Wikipedia_wordmark"));
        Assert.assertTrue(icon.isDisplayed());

    }
}
