package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenelWEbDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void baslangicIslemleri() {

        System.out.println("Driver start ...");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().deleteAllCookies();// todo site seleniumdan geldigini anlayip cooki atiyor

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);

        driver.get("https://opencart.abstracta.us/index");

        loginTest();
    }

    @AfterClass
    void bitisIslemleri() {
        System.out.println("Driver closed...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    void loginTest() {

        WebElement inputMail = driver.findElement(By.id("input-mail"));
        inputMail.sendKeys("ser@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("ser123");

        WebElement clickButton = driver.findElement(By.id("input[value='Login']"));
        clickButton.click();

    }
}
