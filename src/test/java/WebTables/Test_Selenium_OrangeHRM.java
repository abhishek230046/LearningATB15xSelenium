package WebTables;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test_Selenium_OrangeHRM {

    @Owner("Abhishek")
    @Description("Deleting the first terminated employee")
    @Test
    public void test_Webtables() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name = \"username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name = \"password\"]")).sendKeys("Hacker@4321");

        driver.findElement(By.xpath("//button[@type = \"submit\"]")).click();

        Thread.sleep(5000);
        int rows = driver.findElements(By.xpath("//div[contains(@class , \"oxd-table-body\")]//div[contains(@class ,\"oxd-table-row\")]")).size();
        for(int i=2;i<=rows;i++)
        {
                if(driver.findElement(By.xpath("(//div[contains(@class , \"oxd-table-body\")]//div[contains(@class ,\"oxd-table-row\")])["+i+"]//div[contains(@class, \"oxd-table-cell\")][6]")).getText().equals("Terminated"))
                {
                    driver.findElement(By.xpath("(//div[contains(@class , \"oxd-table-body\")]//div[contains(@class ,\"oxd-table-row\")])["+i+"]//div[contains(@class, \"oxd-table-cell\")][6]//following-sibling::div//i")).click();
                    Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class , \"oxd-sheet\")]")).isDisplayed());
                    break;
                }
        }
        driver.quit();
    }

}
