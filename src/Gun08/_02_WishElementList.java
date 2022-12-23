package Gun08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _02_WishElementList {
    public _02_WishElementList(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    @FindBy(className = "input-lg")
    public WebElement searchBtn;

    @FindBy(css = "[class='fa fa-search']")
    public WebElement searchBtnClick;

    @FindBy(css = "[class='row']")
    List<WebElement>searchResult;

    @FindBy(css = "[data-original-title='Add to Wish List']")
    public List<WebElement> wishBtnList;

    @FindBy(linkText = "Wish List (0)")
    public WebElement btnWish;

   @FindBy(css = "td[class='text-left']>a")
    public List<WebElement>tableName;






}
