package techproed.day05_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import techproed.Util;

public class C02_CssSelector {
    public static void main(String[] args) throws InterruptedException {

        /*
        cssSelector ile xpath arasındaki farklar;
        1- cssSelector de @ işareti ve // işaretleri kullanılmaz
        2- xpath ile index alabiliriz ama cssSelector ile index alamayız
        3- xpath ile text olarak locate edebiliriz ama cssSelector ile bunu yapamayız
        4- cssSelector xpath'e göre daha hızlı çalışır
         */

        Util.chromeProperty();
        WebDriver driver = new ChromeDriver();
        Util.maximize(driver);
        Util.duration(driver,15);

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Util.sleep(2);

        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        if(deleteButton.isDisplayed()){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }
        Util.sleep(2);

        //Delete tusuna basin
        deleteButton.click();

        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement h3TAg = driver.findElement(By.cssSelector("h3"));
        if(h3TAg.isDisplayed()){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }
        Util.sleep(2);

        //sayfayı kapatınız
        driver.close();

    }
}
