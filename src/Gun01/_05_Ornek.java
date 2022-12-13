package Gun01;

import Utils.GenelWEbDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _05_Ornek extends GenelWEbDriver {
    @Test
    void loginTest(){

        WebElement inputMail= driver.findElement(By.id("input-mail"));
        inputMail.sendKeys("ser@gmail.com");

        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("ser123");

        WebElement clickButton=driver.findElement(By.id("input[value='Login']"));
        clickButton.click();

        //
        //        email.sendKeys("ser@gmail.com");
        //
        //
        //        pass.sendKeys("ser123");
    }

}
