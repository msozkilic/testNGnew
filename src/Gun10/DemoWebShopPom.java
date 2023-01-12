package Gun10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoWebShopPom extends DemoShopBaseStatic{


    @Test
    public void setDemoWebShopList(){
        DemoWebShopList demoWebShopList=new DemoWebShopList(driver);
        demoWebShopList.loginBtn.click();
        demoWebShopList.eMail.sendKeys("serr@gmail.com");
        demoWebShopList.password.sendKeys("ser123");
        demoWebShopList.apparelShoes.click();
        demoWebShopList.blueSneakers.click();
        demoWebShopList.addToWishList.click();
        driver.navigate().back();
        demoWebShopList.secondProduct.click();
        demoWebShopList.addtoWishList2.click();
        demoWebShopList.wishListPage.click();

        Assert.assertFalse(demoWebShopList.productList.isEmpty());




    }



}
