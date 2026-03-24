package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class relativeLocator {

    @Test
    public void test_relativeLocator() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.switchTo().frame("result");

        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        WebElement user_name = driver.findElement(By.id("username"));

        WebElement error = driver.findElement(with(By.tagName("small")).below(user_name));
        System.out.println(error.getText());

    }
}
