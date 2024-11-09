package com.testingacademy.ex_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium08 {



    public static void main(String[] args) throws MalformedURLException {



        EdgeDriver driver = new EdgeDriver();
        driver.get("https://bing.com");

        // No back, forward allowed in case of get
        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}
