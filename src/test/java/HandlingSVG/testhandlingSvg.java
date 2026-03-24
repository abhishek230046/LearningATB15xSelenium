package HandlingSVG;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testhandlingSvg {

    @Owner("Abhishek Vaish")
    @Description("Search for the Product on Flipkart using SVG")
    @Test
    public void test_svg() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement input_box = driver.findElement(By.name("q"));
        input_box.sendKeys("AC");
        WebElement svg_element = driver.findElement(By.xpath("(//*[local-name() = 'svg'])[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(svg_element).click().perform();
    }
}
