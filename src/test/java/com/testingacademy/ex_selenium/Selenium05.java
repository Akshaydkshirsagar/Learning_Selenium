package com.testingacademy.ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium05 {

    @Test
    public void test01(){

        EdgeOptions options =new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("window-size=1920, 960");
        options.addArguments("--inprivate");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.google.com");
        //options.addArguments("window-size=720, 360") ;
        driver.quit();
    }
}
