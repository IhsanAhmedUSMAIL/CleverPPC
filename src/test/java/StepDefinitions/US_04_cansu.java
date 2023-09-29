package StepDefinitions;

import Pages.DialogContent_Cansu;
import Pages.TopNav;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_04_cansu {
    TopNav ln = new TopNav();
    DialogContent_Cansu dc = new DialogContent_Cansu();

    @Given("Navigate to CleverPPC")
    public void navigateToCleverPPC() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

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














