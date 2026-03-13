package WebTables;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_WebTables {

    @Test
    @Owner("Abhishek Vaish")
    @Description("We are testing web tables.")
    public void test_web_table_login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        int rows = driver.findElements(By.xpath("//table[@id = \"customers\"]//tbody//tr")).size();
        int columns = driver.findElements(By.xpath("//table[@id = \"customers\"]//tbody//tr[1]//td")).size();

        for(int i = 2; i<=rows ;i++)
        {
            for(int j=1;j<=columns;j++)
            {
                String element_text = "//table[@id = \"customers\"]//tbody//tr["+i+"]//td["+j+"]";
                String data = driver.findElement(By.xpath(element_text)).getText();
                if(data.contains("Helen"))
                {
                    String country_path = element_text+"/following-sibling::td";
                    String country_path_text = driver.findElement(By.xpath(country_path)).getText();
                    String company_path = element_text+"/preceding-sibling::td";
                    String company_path_text = driver.findElement(By.xpath(company_path)).getText();
                    System.out.println("____________________________________________");
                    System.out.println("The Helen lives in country = "+country_path_text);
                    System.out.println("The Helen works in company = "+company_path_text);
                }
            }
        }
        driver.quit();
    }
}
