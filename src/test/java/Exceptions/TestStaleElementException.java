package Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestStaleElementException {

    @Test
    public void test_StaleElementException()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement search_text = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        driver.navigate().refresh();
        search_text.sendKeys("Miss Grand Thailand");
    }
}
