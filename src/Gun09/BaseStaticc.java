package Gun09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseStaticc {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void baslangicIslemleri(){
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        Duration duration=Duration.ofSeconds(30);
        driver.manage().timeouts().implicitlyWait(duration);

        wait=new WebDriverWait(driver,Duration.ofSeconds(30));

        driver.get("https://demowebshop.tricentis.com/");


    }
    @AfterClass
    public void bitisIslemleri() {
        System.out.println("Driver closed...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
