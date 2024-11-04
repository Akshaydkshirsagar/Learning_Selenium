package com.testingacademy.ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium03 {

    @Test
    public void test01(){
        WebDriver d= new EdgeDriver();
        d.manage().window().maximize();
        d.get("https://www.google.com");

    }

    @Test
    public void test02(){
        ChromeDriver d1= new ChromeDriver();
        d1.manage().window().maximize();
        d1.get("https://www.google.com");
        String title = d1.getTitle();
        System.out.println("Title of page is "+title);
        d1.quit();



    }
}
