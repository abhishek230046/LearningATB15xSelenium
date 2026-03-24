package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class TestAppvwocom extends CommonMethods {
    @Test
    public void test_app_vwo_com() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");
        WebElement email_field = driver.findElement(By.id("login-username"));
        email_field.sendKeys("admin@admin.com");
        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("wrongpass@1234");
        CommonMethods.checkVisibility(driver,By.id("js-login-btn"),5);
        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

        driver.quit();
    }
}
