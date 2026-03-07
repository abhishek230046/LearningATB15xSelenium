package Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium002 {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://vwo.com");
        driver.quit();
    }
}
