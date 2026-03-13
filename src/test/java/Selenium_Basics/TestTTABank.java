package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTTABank {
    public void test_TTA_Bank()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@type = \"email\"]")).sendKeys("Abhishek@gmail.com");
        driver.findElement(By.xpath("//input[@type = \"password\"))")).sendKeys("12345");

        driver.findElement(By.xpath("//button[@type = \"Submit\"]")).click();

    }
}
