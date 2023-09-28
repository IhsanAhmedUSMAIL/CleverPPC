package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_08_Ihs_content extends US_08_Ihs_Parent{

    public US_08_Ihs_content() {
        PageFactory.initElements(GWD.getDriver(), this);

    }

    @FindBy(xpath = "//a[text()='Contact us']")
    public WebElement contactUs;

    @FindBy(xpath = "//option[@value='2']")
    public WebElement customerService;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "id_order")
    public WebElement orderReference;

    @FindBy(id = "message")
    public WebElement message;

    @FindBy(id = "uniform-fileUpload")
    public WebElement attachFile;

    @FindBy(xpath = "//button[@id='submitMessage' and @name='submitMessage']\n")
    public WebElement send;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement onay;


}
