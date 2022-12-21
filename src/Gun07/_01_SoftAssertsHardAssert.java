package Gun07;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertsHardAssert {

    @Test
    void hardAssert(){
        String s1="Merhaba";

        System.out.println("Hard assert öncesi");
        Assert.assertEquals("Merhaba123","HardAssert Sonucu");
        System.out.println("Hard assert sonrasi");//todo hard assert hata verdiginde sonrasi calismaz
    }
    @Test
    void softAssert(){
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert _softAssert=new SoftAssert();
        _softAssert.assertEquals("www.facebook.com/homepage",strHomePage);//true
        System.out.println("assert 1");

        _softAssert.assertEquals("www.facebook.com/profile",strHomePage);//fail
        System.out.println("assert 2");

        _softAssert.assertEquals("www.facebook.com/settings",strEditAccount);//fail
        System.out.println("assert 3");

        _softAssert.assertAll(); //todo bütün assert hatalarini isleme koyar.
        System.out.println("aktiflik sonrasi");
    }
}
