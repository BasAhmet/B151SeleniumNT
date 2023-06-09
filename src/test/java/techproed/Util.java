package techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Util {
    public static WebDriver chromeProperty(int time){
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
        return driver;
    }
    public static String chromeProperty(){
        return System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
    }
    public static void sleep(int a) throws InterruptedException {
        Thread.sleep(a*1000);
    }
    public static void maximize(WebDriver driver){
        driver.manage().window().maximize();
    }
    public static void duration(WebDriver driver,int a){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
    }
}
