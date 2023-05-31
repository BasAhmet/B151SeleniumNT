package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import techproed.Util;

import java.security.Key;
import java.util.List;

public class C02_WebElementLocator {
    public static void main(String[] args) {
        Util.chromeProperty();
        WebDriver driver = new ChromeDriver();
        Util.maximize(driver);
        Util.duration(driver,15);

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike" yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike",Keys.ENTER);

        // sonuc yazısını yazdırın
        List<WebElement> resultText = driver.findElements(By.className("sg-col-inner"));
        System.out.println(resultText.get(0).getText());

        // sonuc sayısını yazdırın
        String[] sonucSayisi = resultText.get(0).getText().split(" ");
        System.out.println("Sonuç Sayısı : " + sonucSayisi[2]);

        // ilk ürünün locatini alın
        List<WebElement> products = driver.findElements(By.className("s-image"));
        WebElement firstProduct = products.get(0);

        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println(firstProduct.isDisplayed());//Görünür

        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(firstProduct.isEnabled());//Erişilebilir

        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(firstProduct.isSelected());//Seçilme özelliği yok

        // ilk urune tıklayın
        firstProduct.click();

        // sayfayı kapatın
        driver.close();



    }
}
