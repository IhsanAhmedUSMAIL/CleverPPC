package Pages;

import Utilities.GWD_Ihs;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_02_LoginContent_Ihs {

    public US_02_LoginContent_Ihs() {
        PageFactory.initElements(GWD_Ihs.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signIn1;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath = "//i[@class='icon-lock left']")
    public WebElement signIn2;

}
