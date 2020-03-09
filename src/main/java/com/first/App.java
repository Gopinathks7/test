package com.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App 
{
    @Test(invocationCount = 1)
    public void some()
    {
    	String key="webdriver.chrome.driver";
    	String value="E:\\BrowserDrivers\\chromedriver.exe";
    	System.setProperty(key, value);
    	WebDriver driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com");
   
    }
}
