package com.testingacademy.ex_selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Selenium09 {

    @Test

    public void test01(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getTitle(),"Login - VWO", "true");
        System.out.println("webpage title is- "+ driver.getTitle());
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
        System.out.println("current url is- "+ driver.getCurrentUrl());

        driver.quit();


    }
}
