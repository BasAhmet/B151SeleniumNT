package techproed.day06_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import techproed.Util;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Util.chromeProperty(15);

        //amazona gidelim
        driver.get("https://amazon.com");

        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //relative locator kullanarak hybrid bikes altındaki elemente tıklayalım
        //Webelementlerin yazısını konsola yazdıralım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println(hybridBike.getText());
        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        System.out.println(electricBike.getText());
        WebElement completeBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        System.out.println(completeBike.getText());
        System.out.println("*******************************************************************");

        //Bikes altındaki tüm linkleri(webelement) konsola yazdıralım
        List<WebElement> linlkerListesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
        linlkerListesi.forEach(t-> System.out.println(t.getText()));

        //Lambda ile yazdıralım
        System.out.println("Lambda ile : ");
        linlkerListesi.forEach(t-> System.out.println(t.getText()));
        System.out.println("********************************************************************");

        //foreach ile yazdıralım
        System.out.println("foreach ile : ");
        for (WebElement w:linlkerListesi) {
            System.out.println(w.getText());
        }
        System.out.println("*********************************************************************");

        //linklerin hepsine tıklayalım başlıkları alalım
        for (int i = 0; i < linlkerListesi.size(); i++) {
            linlkerListesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
            System.out.println(linlkerListesi.get(i).getText());
            linlkerListesi.get(i).click();
            Util.sleep(2);
            driver.navigate().back();
            Util.sleep(2);
        }



    }
}
