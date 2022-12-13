package Gun02;

import Utils.GenelWEbDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Subscribe extends GenelWEbDriver {

    By link=By.xpath("(//a[text()='Newsletter'])[1]");
    By yes=By.cssSelector("[value='1']");
    By no=By.cssSelector("[value='0']");
    By ctn=By.cssSelector("[value='Continue']");

    @Test(priority = 1)
    void subscribeFunctionYes(){
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Newsletter")));
        WebElement newsletter=driver.findElement(link);
        newsletter.click();

        WebElement yesButton=driver.findElement(yes);
        yesButton.click();

        WebElement continueButton=driver.findElement(ctn);
        continueButton.click();

        Tools.successMessageValidation();

    }
    @Test(priority = 2)
    void subscribeFunctionNo(){
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Newsletter")));
        WebElement noButton=driver.findElement(no);
        noButton.click();

        WebElement continueButton=driver.findElement(ctn);
        continueButton.click();

       Tools.successMessageValidation();


    }
    @Test(priority = 3)
    void subscribeFunctionForBoth(){
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Newsletter")));
        WebElement newsletter=driver.findElement(link);
        newsletter.click();


        WebElement yesButton=driver.findElement(yes);
        WebElement noButton=driver.findElement(no);

        if(yesButton.isSelected()){
            noButton.click();
        } else
            yesButton.click();
        WebElement continueButton=driver.findElement(ctn);
        continueButton.click();

        Tools.successMessageValidation();

        }


    }

