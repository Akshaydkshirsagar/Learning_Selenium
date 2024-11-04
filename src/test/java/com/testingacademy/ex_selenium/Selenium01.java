package com.testingacademy.ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
}
