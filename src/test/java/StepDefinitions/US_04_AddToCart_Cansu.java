package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US_04_AddToCart_Cansu {

    DialogContent dc = new DialogContent();

    @When("Choose the dress")
    public void chooseTheDress() {
        dc.myClick(dc.buttonWomen);
        dc.myClick(dc.buttonDresses);
        dc.myClick(dc.summerDress);
        Actions action = new Actions(GWD.getDriver());
        int randomSecim = (int) (Math.random() * dc.dressesNamesL1.size());
        action.moveToElement(dc.dressesNamesL1.get(randomSecim)).build().perform();
        dc.addBUTTONSS.get(randomSecim).click();
    }

    @Then("User should add successfully")
    public void userShouldAddSuccessfully() {
        dc.verifyContainsText(dc.msg, "successfully");
    }
}














