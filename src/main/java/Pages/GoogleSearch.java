package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleSearch {

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","/Users/junedalam/Documents/SeleniumPractice/lib/geckodriver 2");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String baseURL = "http://google.com/";
        driver.manage().window().maximize();
        driver.get(baseURL);
        WebElement input = driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='a4bIc']/input[@role='combobox']"));
        input.sendKeys("get to ");
       List<WebElement> result = driver.findElements(By.xpath("//ul[@role = 'listbox']//li/descendant::div[contains(@class,'sbl1')]"));
        for (WebElement suggestion: result) {
            if(suggestion.getText().contains("get to the chopper")){
                suggestion.click();
            }
        }

    }
}
