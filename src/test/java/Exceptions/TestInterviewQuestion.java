package Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestInterviewQuestion {

    @Test
    public void test_InterviewQues()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        WebElement element = driver.findElement(By.id("login-username"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].parentNode.removeChild(arguments[0]);", element);
        element.click();
    }
}
