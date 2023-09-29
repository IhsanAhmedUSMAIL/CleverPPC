package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class DialogContent_Faruk extends Parent {
    public DialogContent_Faruk(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy (css = "div[class='header_user_info']")
    public WebElement signInButton;
    @FindBy (id = "email_create")
    public WebElement emailCreateInput;
    @FindBy (id = "SubmitCreate")
    public WebElement createAccountButton;
    @FindBy (id = "customer_firstname")
    public WebElement firstNameInput;
    @FindBy (id = "customer_lastname")
    public WebElement lastNameInput;
    @FindBy (id = "passwd")
    public WebElement passwordInput;
    @FindBy (id = "submitAccount")
    public WebElement registerButton;
    @FindBy (css = "p[class='alert alert-success']")
    public WebElement successText;

    @FindBy (css = "span[class='heading-counter']")
    public WebElement topListNumber;
    @FindBy (css = "div[class='product-count']")
    public WebElement downListNumber;
    @FindBy (xpath = "//ul[@id='product_list']/li")
    public List<WebElement> itemsList;


    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "signInButton": return this.signInButton;
            case "emailCreateInput": return this.emailCreateInput;
            case "createAccountButton": return this.createAccountButton;
            case "firstNameInput": return this.firstNameInput;
            case "lastNameInput": return this.lastNameInput;
            case "passwordInput": return this.passwordInput;
            case "registerButton": return this.registerButton;
            case "successText": return this.successText;

        }

        return null;
    }






}
