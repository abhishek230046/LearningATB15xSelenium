package SelectCheckboxInput;

import Task4March.HelperClass;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Handling_Alerts extends HelperClass {

    @Test
    @Description("Handling Alerts")
    public void test_handlingAlerts()
    {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());

        WebElement element = driver.findElement(By.xpath("//button[@onclick = 'jsAlert()']"));
        WebElement element_dual = driver.findElement(By.xpath("//button[@onclick = 'jsConfirm()']"));
        WebElement element_prompt = driver.findElement(By.xpath("//button[@onclick = 'jsPrompt()']"));

        //Clicking the first alert button
        element.click();
        wait_for_alert(element);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //Clicking on Prompt alert
        element_prompt.click();
        wait_for_alert(element_prompt);
        Alert alert1 = driver.switchTo().alert();
        alert1.sendKeys("Miss Grand Ghana");
        alert1.accept();

        String result = driver.findElement(By.id("result")).getText();
        //Assert.assertEquals(result , "You successfully clicked an alert");
        Assert.assertEquals(result, "You entered: Miss Grand Ghana");



    }
}
