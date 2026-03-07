package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNavigation {

    @Test
    public void test_Navigation()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        //Navigation commands
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}
