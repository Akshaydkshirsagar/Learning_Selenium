package com.testingacademy.ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium04 {
    @Test
    public void test(){

        WebDriver driver = new EdgeDriver();
        EdgeOptions e= new EdgeOptions();
        e.addArguments("--start-maximized");
        e.addArguments("--window-size=800,600");
        driver.get("https://www.google.com");
        driver.quit();
    }
}
