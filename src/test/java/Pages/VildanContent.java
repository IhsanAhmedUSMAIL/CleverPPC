package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VildanContent extends Parent{
    public VildanContent() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

     @FindBy(css = "[title='Log in to your customer account']")
    public WebElement signIn;

    @FindBy(name="email")
    public WebElement eMail;

    @FindBy(name="passwd")
    public WebElement pass;

    @FindBy(css = "[name='SubmitLogin']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[text()='Welcome to your account. Here you can manage all of your personal information and orders.']")
    public WebElement welcomeMessage;



    @FindBy(xpath = "(//a[text()='Dresses'])[2]")
    public WebElement dresses;

    @FindBy(xpath = "//span[text()='Categories']")
    public WebElement scroll;

    @FindBy(xpath = "(//*[@title='Printed Dress'])[2]")
    public WebElement dress;

    @FindBy(xpath = "(//span[text()='Add to cart'])[1]")
    public WebElement addToCart;

    @FindBy(css = "[title='Close window']")
    public WebElement closeWindow;

    @FindBy(xpath = "//b[text()='Cart']")
    public WebElement cart;

   @FindBy(css = "[title='Check out']")
   public WebElement checkOutBtn;
   @FindBy(xpath = "//*[text()='Your delivery address']")
    public WebElement address;

   @FindBy(xpath = "//span[text()='Proceed to checkout']")
    public WebElement proceedBtn;

   @FindBy(xpath = "( //*[ contains( text(), 'My address' )  ])[1]")
    public WebElement adressSelected;

   @FindBy(xpath = "//*[text()='Terms and Conditions']")
   public WebElement scroll2;


   @FindBy(xpath = "//*[text()='I agree to the terms of service and will adhere to them unconditionally.']")
    public WebElement checkBox;

    @FindBy(xpath = "(//*[ contains( text(), 'check' )  ])[2]")

    public WebElement proceedBtn1;

    @FindBy(css = "[id='paypal-standard-btn']")
    public WebElement payPal;

    @FindBy(xpath = "//*[ contains( text(), 'Şu anda bir şeylerin' )  ]")
    public WebElement payPalNagetiveMessage;

    @FindBy(css = "[id='ccbill-standard-btn']")

    public WebElement creditCard;

    @FindBy(xpath = "//body['Invalid request (1).']")

    public WebElement creditCardNegativeMessage;

    @FindBy(css = "[title='Pay by bank wire']")
    public WebElement bankWire;

    @FindBy(xpath = "(//span[text()='$33.00'])[2]")

    public WebElement totalPrice;

    @FindBy(xpath = "//p//span[text()='$33.00']")
    public  WebElement lastTotal;

    @FindBy(xpath = "//*[text()='I confirm my order']")
    public WebElement confirm;

    @FindBy(xpath = "//p[text()='Your order on Xu Clothing is complete.']")
    public WebElement confirmMessage;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div")
    public WebElement orderNumber;















    }








//    @FindBy(css = "[src='https://cleverppc.com/prestashop4/img/p/8/8-home_default.jpg']")
//    public WebElement firsDress;
//
//
//    @FindBy(css = "[title='Continue shopping']")
//    public WebElement countinueBtn;




