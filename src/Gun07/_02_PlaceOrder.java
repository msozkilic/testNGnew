package Gun07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenelWebDriver;

public class _02_PlaceOrder extends GenelWebDriver {
    /* todo Siteyi aciniz,
       ipod kelimesini aratiniz,cikan sonuclardan ilkini sepete atiniz
       shopping charta tiklatiniz.
       Checkout yapiniz,Continue butonlarina tiklatip bilgileri giriniz,
       En confirm ile siparisi verdigiginizi dogrulayiniz,dogrulamayi da cikan sayfadaki
       "Your order has been placed" yazisi ile yapiniz.
     */
    @Test
    void ProoceedToCheckout(){
        WebElement searchBtn=driver.findElement(By.className("input-lg"));
        searchBtn.sendKeys("ipod");

        WebElement searchBtnClick=driver.findElement(By.className("fa-search"));
        searchBtnClick.click();

        WebElement addToChart=driver.findElement(By.xpath("(//*[text()='Add to Cart'])[1]"));
        addToChart.click();

        WebElement shoppingCart=driver.findElement(By.linkText("Shopping Cart"));
        shoppingCart.click();

       // JavascriptExecutor js=(JavascriptExecutor)driver;
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        WebElement checkout=driver.findElement(By.linkText("Checkout"));
        checkout.click();

        WebElement continue2Btn=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
        continue2Btn.click();

        WebElement continue4=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='button-shipping-address']")));
        continue4.click();

        WebElement continueBtnSchippingMethod=wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("[id='button-shipping-method']"))));
        continueBtnSchippingMethod.click();

        WebElement agree2=driver.findElement(By.cssSelector("[name='agree']"));
        agree2.click();

        WebElement continueBtnPaymentMethod=driver.findElement(By.cssSelector("[id='button-payment-method']"));
        continueBtnPaymentMethod.click();

        WebElement confirmButton=driver.findElement(By.cssSelector("[id=\"button-confirm\"]"));
        confirmButton.click();

        wait.until(ExpectedConditions.urlContains("success"));

        WebElement lastConfirm=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='content']>h1")));
        Assert.assertTrue(lastConfirm.getText().contains("Your order has been placed"));
       // Assert.assertEquals(lastConfirm.getText(),"Your order has been placed","Karsilastirma sonucu");

        /* Assert.assertTrue(lastConfirm.isDisplayed(),"Your order has been placed");
        Assert.assertEquals(lastConfirm.getText().contains("Your order has been placed"),"Your order has been placed");
        Assert.assertTrue(lastConfirm.getText().contains("Your order has been placed"));
        Assert.assertTrue(lastConfirm.isEnabled());
        Assert.assertEquals(lastConfirm.isDisplayed(),lastConfirm.getText());*/

    }
}
