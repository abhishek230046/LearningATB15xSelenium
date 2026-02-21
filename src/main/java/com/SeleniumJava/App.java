package com.SeleniumJava;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
}
