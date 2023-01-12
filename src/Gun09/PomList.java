package Gun09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

public class PomList {
    public PomList(WebDriver driver) {
      PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Log in")
    public WebElement loginBtn;
    @FindBy(css = "[id=\"Email\"]")
    public WebElement eMail;

    @FindBy(css = "[id=\"Password\"]")
    public WebElement password;

    @FindBy(css = "[value=\"Log in\"]")
    public WebElement loginBtnClick;

    @FindBy(linkText = "Contact us")
    public WebElement contactUs;

    @FindBy(css = "[id=\"Enquiry\"]")
    public WebElement enquiry;

    @FindBy(css = "[name=\"send-email\"]")
    public WebElement submitBtn;

    @FindBy(css = "[class=\"result\"]")
    public WebElement messageValidate;




}
