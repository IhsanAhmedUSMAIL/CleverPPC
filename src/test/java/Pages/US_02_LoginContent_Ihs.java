package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_02_LoginContent_Ihs extends US_08_Ihs_Parent{

    public US_02_LoginContent_Ihs() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signIn1;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath = "//i[@class='icon-lock left']")
    public WebElement signIn2;

    @FindBy (xpath = "(//div[@class='alert alert-danger'])[1]")
    public  WebElement hata;

    @FindBy(xpath = "//p[text()='Welcome to your account. Here you can manage all of your personal information and orders.']")
    public WebElement welcomeMessage;

}
