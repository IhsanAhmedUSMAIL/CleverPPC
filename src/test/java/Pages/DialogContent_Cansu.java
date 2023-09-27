package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class DialogContent_Cansu extends Parent{
    public DialogContent_Cansu() {
        PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy(xpath="//a[@title='Women']")
    public WebElement buttonWomen;

    @FindBy(xpath="//li[@class='last']//span[@class='grower CLOSE']")
    public WebElement buttonDresses;

    @FindBy(xpath="(//a[@href='https://cleverppc.com/prestashop4/index.php?id_category=11&controller=category&id_lang=1'])[3]")
    public WebElement summerDress;

    @FindBy(xpath = "//span[@class='title']")
    public WebElement msg;

    @FindBy(css = "a[title='Add to cart'] span")  // 5 taneli,
    public List<WebElement> addBUTTONSS;

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement dRESSESbutton;

    @FindBy(xpath = "//i[@class='icon-th-list']")
    public WebElement listelemeButonu;

    @FindBy(id = "add_to_cart") //urunlerın ıcıne tıklayınca olan ekeleme
    public WebElement ekleme;

    @FindBy(xpath = "//div[@class='button-container']/span")
    public WebElement continueButton;

    @FindBy(css = "h5[itemprop='name']")
    public List<WebElement> dressesNamesL1;

    @FindBy(xpath = "//p[@class='product-desc']")
    public List<WebElement> descriptions;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//span[@id='summary_products_quantity']")
    public WebElement cartContains;

}
