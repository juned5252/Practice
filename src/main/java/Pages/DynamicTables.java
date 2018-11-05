package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTables {

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","/Users/junedalam/Documents/SeleniumPractice/lib/geckodriver 2");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String baseURL = "https://www.w3schools.com/html/html_tables.asp";
        driver.manage().window().maximize();
        driver.get(baseURL);
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='w3-example']//tbody//tr"));
        int size = list.size();
        String before = "//div[@class='w3-example']//tbody//tr[";
        String after = "]/td[1]";
       for (int i = 2; i<size;i++){
           System.out.println(driver.findElement(By.xpath(before +i+ after)).getText());
       }
    }
}
