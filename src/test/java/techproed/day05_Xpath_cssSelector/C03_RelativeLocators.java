package techproed.day05_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import techproed.Util;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_RelativeLocators {
    public static void main(String[] args) {
        Util.chromeProperty();
        WebDriver driver = new ChromeDriver();
        Util.maximize(driver);
        Util.duration(driver,15);
        //amazona gidelim
        driver.get("https://www.amazon.com");

        //city bike aratalım
        WebElement search = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        search.sendKeys("city bike", Keys.ENTER);

        //relative locator ile Hybrid Bikes altındaki elemente tıklayalım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement electrikBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        WebElement completeBike = driver.findElement(with(By.tagName("a")).below((electrikBike)));
        completeBike.click();

    }
}
