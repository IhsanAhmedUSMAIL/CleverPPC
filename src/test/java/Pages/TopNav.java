package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNav extends Parent{

    public TopNav() {

        PageFactory.initElements(GWD.getDriver(), this);

    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;



    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup" : return this.setup; // return olduğu için break; gerek kalmıyor

        }
        return null;
    }

}