package techproed.day03_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import techproed.Util;

import java.util.List;

public class C03_FindElements {
    public static void main(String[] args) {
        Util.chromeProperty();
        WebDriver driver = new ChromeDriver();
        Util.maximize(driver);
        Util.duration(driver,10);

        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //Sayfadaki linklerin sayısını ve linkleri yazdıralım
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int count = 1;
        for (WebElement w:links) {
            if(!w.getText().equals("")){
                System.out.println(count + ". link : " + w.getText());
                count++;
            }
        }
        System.out.println("\nlink sayısı : " + links.size());

        driver.close();

    }
}
