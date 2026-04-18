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

public class SpiceJet extends HelperClass {

    @Test
    @Description("Entering source and Destination")
    public void test_SpiceJet() throws InterruptedException {
        driver.get("https://www.spicejet.com/");
        WebElement fromPlace = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input"));
        wait_for_visibility(fromPlace);
        WebElement Destination = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fromPlace).click().sendKeys("Thailand").moveToElement(Destination).click().sendKeys("Myanmmar").build().perform();
        jswait();
    }

}
