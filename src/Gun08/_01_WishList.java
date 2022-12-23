package Gun08;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.GenelWebDriver;
import utils.Tools;

public class _01_WishList {
    //Siteye gidiniz,1.Test ipod ürününü aratiniz.cikan elemanlardan random bir elemani add wish butonunatikla
    //Burada cikan ürünle tiklanan ürünün isminin ayni olup olmadigini dogrulayiniz.

    @Test
    @Parameters("ürün")
    void ürünSatinAl(String eleman){
        _02_WishElementList elementList=new _02_WishElementList(driver);

       /*Gun07._03_PlaceOrderElements poe=new _03_PlaceOrderElements(driver);
       poe.searcBtn.sendKeys("ipod");
       poe.searchBtnClick.click();*/

        elementList.searchBtn.sendKeys(eleman);
        elementList.searchBtnClick.click();

        //int random=(int) (Math.random()*elementList.searchResult.size());
        int rndNumber= Tools.randomGenerator(elementList.searchResult.size());


        String rndUrunAd=elementList.searchResult.get(rndNumber).getText();
        elementList.wishBtnList.get(rndNumber).click();

        elementList.btnWish.click();

        boolean bulundu=false;
        for (WebElement e:elementList.tableName
             ) {
            if (e.getText().equals(rndUrunAd))
            bulundu=true;
            break;
        }
        Assert.assertTrue(bulundu);

        }







    }





