package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import techproed.Util;

public class C02_Submit {
    /*
    Bir webelementin locate'ini birden fazla kullanacaksaniz bir Webelement'te değişken olarak atayabilirsiniz.
    Webelement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox")); şeklinde kullanabiliriz
    1-Locate işlemi bittikten sonra eğer webelemente bir metin göndereceksek sendKeys() methodu kullanırız
    2-webelemente tıklayacaksak click() methodu kullanırız
    3-webelementin üzerindeki yazıyı almak istiyorsak getText() methodunu kullanırız
    4-sendKeys() methodundan sonra(yani webElemente metin gönderdikten sonra) Keys.ENTER ile yada
    submit() methodu ile manuel olarak enter yaptığımız gibi otomasyonda da yapabiliriz.
     */
    public static void main(String[] args) throws InterruptedException {
        Util.chromeProperty();
        WebDriver driver = new ChromeDriver();
        Util.maximize(driver);
        Util.duration(driver,20);

        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //Arama kutusunu locate edelim
        WebElement search = driver.findElement(By.name("field-keywords"));

        //Arama kutusuna iphone yazdıralım ve aratalım
        search.sendKeys("iphone");
        Util.sleep(1);
        search.submit();
        Util.sleep(2);

        //Sayfayı kapatalım
        driver.close();
    }
}
