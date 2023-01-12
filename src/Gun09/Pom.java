package Gun09;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Pom extends BaseStaticc {

    @Test
    @Parameters({"email","password"})
    void loginIslem(String email,String password){
        PomList pomList=new PomList(driver);
        pomList.loginBtn.click();
        pomList.eMail.sendKeys(email);
        pomList.password.sendKeys(password);
        pomList.loginBtnClick.click();
        pomList.contactUs.click();
        pomList.enquiry.sendKeys("alles wird immer gut");
        pomList.submitBtn.click();

        Assert.assertTrue(pomList.messageValidate.isDisplayed(),"message ");





    }

}
