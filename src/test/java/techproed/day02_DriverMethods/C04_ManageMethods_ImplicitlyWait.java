package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //techproed sayfasina gidelim
        driver.get("https://techproeducation.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //amazona gidelim
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //techpro sayfasina geri donelim
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //sayfa basligini techpro icerdigini test edelim
        String actualTitleTech = driver.getTitle();
        String expectedTitleTech = "techpro" ;
        if (actualTitleTech.contains(expectedTitleTech)) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test FAILED");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //sayfa basligini Amazon icerdigini test edelim
        String actualTitleAmazon = driver.getTitle();
        String expectedTitleAmazon = "Amazon";
        if (actualTitleAmazon.contains(expectedTitleAmazon)) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test FAILED");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(3000);

        driver.close();


    }
}
