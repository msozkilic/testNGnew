package Gun10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DemoWebShopList {

    public DemoWebShopList(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Log in")
    public WebElement loginBtn;
    @FindBy(css = "[id=\"Email\"]")
    public WebElement eMail;

    @FindBy(css = "[id=\"Password\"]")
    public WebElement password;

    @FindBy(css = "[class=\"top-menu\"]>:nth-child(4)")
    public WebElement apparelShoes;

    @FindBy(css = "[alt=\"Picture of Blue and green Sneaker\"]")
    public WebElement blueSneakers;

    @FindBy(css = "[id=\"add-to-wishlist-button-28\"]")
    public WebElement addToWishList;

    @FindBy(css = "[alt=\"Picture of 50's Rockabilly Polka Dot Top JR Plus Size\"]")
    public WebElement secondProduct;

    @FindBy(css = "[id=\"add-to-wishlist-button-5\"]")
    public WebElement addtoWishList2;

    @FindBy(xpath = "(//*[text()='Wishlist'])[1]")
    public WebElement wishListPage;

    @FindAll(@FindBy(css = "[class=\"cart-item-row\"]"))
    public List<WebElement>productList;


}
