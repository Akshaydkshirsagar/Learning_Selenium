package com.testingacademy.ex_selenium;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Selenium06 {

    @Test
    public void test01(){

        ChromeOptions o = new ChromeOptions();
        o.addArguments("--start maximized");
        o.addArguments("--incognito");

        WebDriver d = new ChromeDriver(o);
        d.get("https://www.google.com");
        d.quit();


    }
}
