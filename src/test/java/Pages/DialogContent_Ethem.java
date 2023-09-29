package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent_Ethem extends Parent{
    public DialogContent_Ethem() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(xpath="//a[@class='login']")
    public WebElement signin;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="passwd")
    public WebElement password;

    @FindBy(id="SubmitLogin")
    public WebElement siginlogin;

    @FindBy(xpath="//*[text()='My account']")
    public WebElement successMessage;

    @FindBy(xpath ="//*[@title='Sitemap']")
    public WebElement SiteMap;

    @FindBy(xpath ="//*[@title='View a list of my addresses']")
    public WebElement Addresses;

    @FindBy(xpath ="//*[@title='Add an address']")
    public WebElement adanewaddress;

    @FindBy(id="firstname")
    public WebElement firstNameInput;

    @FindBy(id="lastname")
    public WebElement lastNameInput;

    @FindBy(id="address1")
    public WebElement address;

    @FindBy(id="city")
    public WebElement city;


    @FindBy(id="postcode")
    public WebElement zip;

    @FindBy(id="phone")
    public WebElement homephone;

    @FindBy(id="phone_mobile")
    public WebElement mobilephone;

    @FindBy(id="alias")
    public WebElement reference;

    @FindBy(id="submitAddress")
    public WebElement saveButton;
    @FindBy(xpath = "//*[@class='addresses']")
    public WebElement successText;

    @FindBy(css="[id='id_state' ] [value='5']")
    public WebElement state;


    public WebElement getWebElement(String strElement)
    {
        switch (strElement)
        {
            case "sigin": return this.signin;
            case "email": return this.email;
            case "password": return this.password;
            case "siginlogin": return this.siginlogin;
            case "SiteMap": return this.SiteMap;
            case "Addresses": return  this.Addresses;
            case "adanewaddress": return this.adanewaddress;
            case "firstNameInput": return this.firstNameInput;
            case "lastNameInput": return this.lastNameInput;
            case "address": return this.address;
            case "city": return this.city;
            case "state": return this.state;
            case "zip": return this.zip;
            case "homephone": return this.homephone;
            case "mobilephone": return this.mobilephone;
            case "reference": return this.reference;
            case "saveButton": return this.saveButton;
            case "successText": return this.successText;

        }
        return null;
    }




}
