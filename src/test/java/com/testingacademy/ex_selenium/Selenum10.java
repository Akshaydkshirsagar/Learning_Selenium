package com.testingacademy.ex_selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenum10 {

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println("Webpage title is- " + driver.getTitle());
        System.out.println("current url is -" + driver.getCurrentUrl());
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);
        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("verified");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
        driver.quit();

    }
}