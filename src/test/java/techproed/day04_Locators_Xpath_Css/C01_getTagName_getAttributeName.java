package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import techproed.Util;

public class C01_getTagName_getAttributeName {
    public static void main(String[] args) {
        Util.chromeProperty();
        WebDriver driver = new ChromeDriver();
        Util.maximize(driver);
        Util.duration(driver,15);

        //amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        //arama kutusunun tagName'inin input oldugunu test edin
        String actualTagName = searchBox.getTagName();
        String expectedTagName = "input";
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("Test PASSED.");
        }else{
            System.out.println("Test FAILED.");
        }

        //arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        String actualAttributeName = searchBox.getAttribute("name");
        String expectedAttributeName = "field-keywords";
        if(actualAttributeName.equals(expectedAttributeName)){
            System.out.println("Test PASSED.");
        }else{
            System.out.println("Test FAILED.");
        }

        //sayfayı kapatınız
        driver.close();

    }
}
