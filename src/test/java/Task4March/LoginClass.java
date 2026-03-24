package Task4March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginClass extends HelperClass{

    @Test
    public void test_app_vwo_login()
    {
        driver.get("https://app.vwo.com/#/login");

        WebElement username = driver.findElement(By.id("login-username"));
        enter_user_email(username , "admin@admin.com");

        WebElement password = driver.findElement(By.id("login-password"));
        enter_password(password, "admin");

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_btn(submit_button);

        WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
        wait_for_visibility(error_message);
        Assert.assertEquals((error_message.getText()),("Your email, password, IP address or location did not match"));
    }
}
