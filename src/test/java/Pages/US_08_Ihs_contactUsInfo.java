package Pages;

import Utilities.GWD_Ihs;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_08_Ihs_contactUsInfo {

    public US_08_Ihs_contactUsInfo() {
        PageFactory.initElements(GWD_Ihs.getDriver(), this);

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

}
