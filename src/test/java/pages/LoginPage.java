package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(id="UserName")
    public WebElement usernameBox;

    @FindBy(id="Password")
    public WebElement passwordBox;

    @FindBy(xpath="//input[@type='submit']")
    public WebElement loginBtn;

    public LoginPage(){PageFactory.initElements(driver,this);}
}
