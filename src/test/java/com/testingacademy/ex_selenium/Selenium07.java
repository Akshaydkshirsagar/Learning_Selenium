package com.testingacademy.ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;


public class Selenium07 {
    @Test
    // Open google and verify title and current url using assret
    public void test01(){

       // WebDriverManager.ChromeDriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myasta.avadhutsathe.in");
        String expectedTitle= "Asta | Asta";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "Title Verified" );
        System.out.println("Webpage title is " +actualTitle);
        String expectedUrl= "https://myasta.avadhutsathe.in/login";
        String currentUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, currentUrl);
        System.out.println("current url is "+currentUrl);
        driver.quit();


    }
}
