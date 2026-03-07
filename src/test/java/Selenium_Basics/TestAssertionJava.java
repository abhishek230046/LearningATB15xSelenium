package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestAssertionJava {
    @Test
    public void test()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        //TestNg
        Assert.assertEquals(driver.getTitle(),"Google");

        //AssertJ
        assertThat(driver.getTitle()).isEqualTo("Google").isEmpty(); //added multiple assertions

        driver.quit();
    }

}
