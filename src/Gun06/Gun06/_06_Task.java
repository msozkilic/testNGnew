package Gun06.Gun06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenelWebDriver;
import utils.Tools;

import java.util.List;

public class _06_Task extends GenelWebDriver {
    //todo Siteye gidiniz.Speicals tiklayiniz,cikan ürün sayisi ile indirimli
    //todo ürün sayisi ayni mi karsilastiriniz.sonra her ürünün önceki fiyatinin
    //todo su andaki fiyattan yüksek oldugunu dogrulayiniz.

    @Test
    void urunSayilari(){
        WebElement speicals=driver.findElement(By.linkText("Specials"));
        speicals.click();

        List<WebElement>products=driver.findElements(By.xpath("//*[@id=\"content\"]/div[2]"));
        List<WebElement>oldPricelist=driver.findElements(By.className("price-old"));

        Assert.assertEquals(products.size(),oldPricelist.size());

       List<WebElement>newPriceList=driver.findElements(By.cssSelector(""));
        for (int i = 0; i < newPriceList.size(); i++) {
            Assert.assertTrue(Tools.WebElementToDouble(newPriceList.get(i))<
                    Tools.WebElementToDouble(oldPricelist.get(i)) );

        }
    }
}
