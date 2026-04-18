package ActionClasses;

import Task4March.HelperClass;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class KeyboardActions extends HelperClass {

    @Test
    @Description("Keyboard actions to enter first name in caps")
    public void test_ActionKeyboard() throws InterruptedException {
        driver.get("https://awesomeqa.com/practice.html");
        jswait();

        WebElement name = driver.findElement(By.name("firstname"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).sendKeys(name, "Miss grand ghana").keyUp(Keys.SHIFT).build().perform();
        jswait();

    }

}
