package SelectCheckboxInput;

import Task4March.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelect extends HelperClass {

    @Test
    public void select_text()
    {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement select_element = driver.findElement(By.id("dropdown"));
        Select select = new Select(select_element);
        select.selectByVisibleText("Option 1");
    }
}
