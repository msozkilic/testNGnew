package Gun06.Gun06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenelWebDriver;

import java.util.List;

public class _04_Task extends GenelWebDriver {
    //todo daha önce olan search fonksiyonu mac,ipod ve samsung icin dataprovider ile yapiniz.

    @Test(dataProvider = "getData")
    void searchMac(String search) {
        WebElement searchBtn = driver.findElement(By.className("input-lg"));
        searchBtn.clear();
        searchBtn.sendKeys(search);
        WebElement btn=driver.findElement(By.className("fa-search"));
        btn.click();

        List<WebElement> macList=driver.findElements(By.id("[id='content']"));
        for (WebElement e:macList
        ) {
            Assert.assertTrue(e.getText().contains(search));
        }
    }

  /*  @DataProvider
    public Object[] getData(){
        Object[]data={"mac","ipod","samsung"};

        return data;
    }*/
}
