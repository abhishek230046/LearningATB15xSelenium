package HandlingSVG;

import Task4March.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class MapMarkersSvg extends HelperClass {

    @Test
    public void mac_svg() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@role = 'button']")).click();
        Thread.sleep(3000);
        WebElement input_field =  driver.findElement(By.name("q"));
        wait_for_visibility(input_field);
        input_field.sendKeys("Mac Mini");

        List <WebElement> search_icon = driver.findElements(By.xpath("//*[local-name() = 'svg']"));
        search_icon.get(2).click();
        Thread.sleep(3000);

        List<WebElement> title = driver.findElements(By.xpath("//a[@class='pIpigb']"));
        for(WebElement tit: title)
        {
            System.out.println(tit.getText());
        }

        List<WebElement> price = driver.findElements(By.xpath("//div[@class = 'hZ3P6w']"));
        long min_price = Long.parseLong(price.get(0).getText().substring(1).replace(",",""));
        for(WebElement pr:price)
        {
            String text = pr.getText().substring(1).replace(",","");
            System.out.println("The price of mac is"+text);
            long value = Long.parseLong(text);
            if(value<min_price)
            {
                min_price = value;
            }
        }

        System.out.println("The lowest price mac mini is "+min_price);







    }
}
