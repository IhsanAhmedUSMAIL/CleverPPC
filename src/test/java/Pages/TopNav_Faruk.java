package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNav_Faruk extends Parent {
    public TopNav_Faruk(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement dressesButton;




}
