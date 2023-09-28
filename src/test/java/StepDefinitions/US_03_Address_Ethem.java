package StepDefinitions;

import Pages.DialogContent_Ethem;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US_03_Address_Ethem {
    DialogContent_Ethem dc=new DialogContent_Ethem();

    @Given("Navigate to CleverPPC")
    public void navigateToCleverPPC() {
        System.out.println("Site açıldı");
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }
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
    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dc.mySendKeyes(dc.email,"123eto@hotmail.com");
        dc.mySendKeyes(dc.password,"123qwe");
        dc.myClick(dc.siginlogin);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully()
    {
        dc.verifyContainsText(dc.successMessage,"My account");
    }


    @When("Click on the element in DialogContent")
    public void clickOnTheElementInDialogContent(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement(strButtonsList.get(i));
            dc.myClick(linkWebElement);
        }
    }

    @And("User sending the keys in DialogContent")
    public void userSendingTheKeysInDialogContent(DataTable dt)
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
        dc.verifyContainsText(dc.successText, "Your addresses are listed below.");
    }


}
