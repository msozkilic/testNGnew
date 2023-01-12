package Gun10;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class DemoShopBaseStatic {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void beforeClass(){
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        Duration duration=Duration.ofSeconds(30);
        driver.manage().timeouts().implicitlyWait(duration);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        wait=new WebDriverWait(driver,duration);

        driver.get("https://demowebshop.tricentis.com/");


    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
