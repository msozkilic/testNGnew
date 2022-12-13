package Gun02;

import Utils.GenelWEbDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_EditAccount extends GenelWEbDriver {


    By edit=By.cssSelector("[class=\"list-group\"]>:nth-child(1)");
    By username=By.id("By.cssSelector(");
    By lastname=By.cssSelector("input[id=\"input-lastname\"]");
    By email=By.cssSelector("input[id=\"input-email\"]");
    By telno=By.cssSelector("input[id=\"input-telephone\"]");
    By validate=By.className("alert-dismissible");
    @Test
    void editAccount(){
        WebElement editAc=driver.findElement(edit);
        editAc.click();

        WebElement userName=driver.findElement(username);
        userName.clear();
        userName.sendKeys("Serkan");

        WebElement lastName=driver.findElement(lastname);
        lastName.clear();
        lastName.sendKeys("kilic");

        WebElement eMail=driver.findElement(email);
        eMail.clear();
        eMail.sendKeys("ser@gmail.com");

        WebElement telNo=driver.findElement(telno);
        telNo.clear();
        telNo.sendKeys("123456789");

        WebElement valiDate=driver.findElement(validate);
        Assert.assertTrue(valiDate.getText().contains("succesfully"));











    }

}
