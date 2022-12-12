package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _04_Enable {
    @Test
    void test1(){
        System.out.println("Test 1");
    }
    @Test(enabled = false)
    void test2(){
        System.out.println("Test 2");
    }
    @Test
    void test3(){
        System.out.println("Test 3");
    }
    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    void baslangicIslemleri(){
        System.out.println("Driver start ...");
        Logger logger=Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().deleteAllCookies();// todo site seleniumdan geldigini anlayip cooki atiyor

        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);
    }
    @AfterClass
    void bitisIslemleri(){
        System.out.println("Driver closed...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
