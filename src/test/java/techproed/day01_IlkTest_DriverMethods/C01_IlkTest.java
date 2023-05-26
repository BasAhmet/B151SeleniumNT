package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında sistem özelliklerini ayarlamak için setProperty methodu ile kullanırız

        //setProperty methodu ile class'ımıza driver'ın fiziki yolunu belirtiriz.
        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" değerini girerek "value" ye ulaşabilirim

        WebDriver driver = new ChromeDriver();
        driver.get("https://ahmetbas.vercel.app/index.html");
        driver.close();
    }
}
