package ActionClasses;

import Task4March.HelperClass;
import com.google.j2objc.annotations.Weak;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Booking extends HelperClass {

    @Test
    @Description
    public void test_Booking() throws InterruptedException {
        driver.get("https://www.booking.com/");

        WebElement close_button = wait_for_visibility(By.xpath("//button[contains(@aria-label,'Dismiss')]"));
        close_button.click();

        WebElement Flights = driver.findElement(By.xpath("//span[text() = 'Flights']"));
        wait_for_visibility(Flights);
        Flights.click();

        WebElement destination = driver.findElement(By.xpath("//span[text() = 'Going to']"));
        wait_for_visibility(destination);
        Actions actions = new Actions(driver);
        actions.moveToElement(destination).click().pause(3).sendKeys("THAILAND").keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform();
        driver.findElement(By.xpath("//span[text() = 'Search']")).click();
        jswait();
    }
}
