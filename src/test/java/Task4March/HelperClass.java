package Task4March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class HelperClass {

    public static WebDriver driver;

    @BeforeTest
    public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void wait_for_visibility(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void wait_for_element_clickable(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }



    public static void enter_user_email(WebElement email_field, String email)
    {
        wait_for_visibility(email_field);
        email_field.sendKeys(email);
    }

    public static void enter_password(WebElement password_element , String password)
    {
        wait_for_visibility(password_element);
        password_element.sendKeys(password);
    }

    public static void submit_btn(WebElement button)
    {
         wait_for_element_clickable(button);
         button.click();
    }

    @AfterTest
    public void teardown()
    {
        driver.quit();
    }
}
