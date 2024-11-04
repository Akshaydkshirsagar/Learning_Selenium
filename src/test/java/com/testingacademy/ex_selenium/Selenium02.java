package com.testingacademy.ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Selenium02 {
    public static  void main (String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myasta.avadhutsathe.in/login");
        driver.quit();
        RemoteWebDriver webdriver;
        ChromeDriver driver1;
        EdgeDriver driver2;
        FirefoxDriver d = new FirefoxDriver();
        SafariDriver d1;
        InternetExplorerDriver d2;
        d.get("https://myasta.avadhutsathe.in/login");






    }
}
