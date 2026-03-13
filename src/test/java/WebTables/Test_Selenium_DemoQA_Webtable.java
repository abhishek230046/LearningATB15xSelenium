package WebTables;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Selenium_DemoQA_Webtable {
    @Owner("Abhishek Vaish")
    @Description("Find the Legal Department and deleting that department.")
    @Test
    public void test_handling_webtable() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Adding the new Employees
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("Shyani");
        driver.findElement(By.id("lastName")).sendKeys("Doshi");
        driver.findElement(By.id("userEmail")).sendKeys("shyani@gmail.com");
        driver.findElement(By.id("age")).sendKeys("43");
        driver.findElement(By.id("salary")).sendKeys("43555");
        driver.findElement(By.id("department")).sendKeys("Legal");

        //Submit
        driver.findElement(By.id("submit")).click();
        Thread.sleep(3000);

        int j;
        int rows = driver.findElements(By.xpath("//tbody//tr")).size();
        for(int i=1;i<=rows;i++)
        {
            if(driver.findElement(By.xpath("//tbody//tr["+i+"]//td[6]")).getText().equalsIgnoreCase("Legal"))
            {
                driver.findElement(By.xpath("//tbody//tr["+i+"]//td[6]//following-sibling::td//span[@title = 'Delete']")).click();
                rows = driver.findElements(By.xpath("//tbody//tr")).size();
                Thread.sleep(2000);
            }
        }
        driver.quit();
    }
}
