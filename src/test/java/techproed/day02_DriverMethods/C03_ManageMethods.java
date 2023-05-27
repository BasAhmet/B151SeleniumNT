package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfa Konumu : " + driver.manage().window().getPosition());
        Thread.sleep(3000);

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfa Boyutları : " + driver.manage().window().getSize());
        Thread.sleep(2000);

        //Browser'ı maximize yapalım
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
        Thread.sleep(2000);

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfa Konumu : " + driver.manage().window().getPosition());
        Thread.sleep(2000);

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfa Boyutları : " + driver.manage().window().getSize());
        Thread.sleep(2000);

        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(2000);

        //Sayfayı fullScreen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(2000);

        driver.manage().window().setPosition(new Point(50,50));//istediğimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size'a getirir
        Thread.sleep(3000);

        driver.close();

    }
}
