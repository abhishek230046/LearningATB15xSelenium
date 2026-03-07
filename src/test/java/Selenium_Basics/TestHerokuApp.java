package Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHerokuApp {

    @Owner("Abhishek Vaish")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Testing the header and URL of the application")
    @Test
    public void test_heroku_app() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("btn-make-appointment")).click();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.clear();
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.clear();
        password.sendKeys("ThisIsNotAPassword");

        WebElement button = driver.findElement(By.id("btn-login"));
        button.click();
        Thread.sleep(3000);


        WebElement header = driver.findElement(By.xpath("//h2"));
        Assert.assertEquals(header.getText(), "Make Appointment");

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();

    }
}
