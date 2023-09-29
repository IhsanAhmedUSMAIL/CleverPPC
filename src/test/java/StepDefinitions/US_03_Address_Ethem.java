package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_03_Address_Ethem {
    DialogContent dc=new DialogContent();

    @When("Click the SiteMap")
    public void clickTheSiteMap()
    {
         dc.myClick(dc.signin);

    }
    @And("Click the Address")
    public void clickTheAddress()
    {
        dc.myClick(dc.SiteMap);
        dc.myClick(dc.Addresses);
    }
    @When("User enters username and password and click login button")
    public void userEntersUsernameAndPasswordAndClickLoginButton() {

        dc.mySendKeyes(dc.email,"cekk7@gmail.com");
        dc.mySendKeyes(dc.password,"far123");
        dc.myClick(dc.siginlogin);
    }

    @Then("User should be able to login positively")
    public void userShouldBeAbleToLoginPositively()
    {
        dc.verifyContainsText(dc.successMessage,"My account");
    }


    @When("Clicks on the element in DialogContent")
    public void clicksOnTheElementInDialogContent(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement(strButtonsList.get(i));
            dc.myClick(linkWebElement);
        }
    }

    @And("User send the keys in DialogContent")
    public void userSendTheKeysInDialogContent(DataTable dt)
    {
        List< List<String> >   items=  dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e=dc.getWebElement(items.get(i).get(0)); // 0. webelement
            String yazi = items.get(i).get(1);//1. yazısı

            dc.mySendKeyes(e, yazi);
        }
    }
    @And("select state")
    public void selectState()
    {
        dc.myClick(dc.state);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.successTextET, "Your addresses are listed below.");
    }


}
