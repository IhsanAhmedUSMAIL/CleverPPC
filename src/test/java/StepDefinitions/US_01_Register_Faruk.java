package StepDefinitions;

import Pages.DialogContent_Faruk;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US_01_Register_Faruk {

    DialogContent_Faruk dc = new DialogContent_Faruk();
    @Given("Navigate to CleverPPC")
    public void navigateToCleverPPC() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("Click on the element in DialogContent_Faruk")
    public void clickOnTheElementInDialogContent_Faruk(DataTable buttons) {
        List<String> buttonsStr = buttons.asList(String.class);
        for (int i = 0; i <buttonsStr.size() ; i++) {
            WebElement linkElement = dc.getWebElement(buttonsStr.get(i));
            dc.myClick(linkElement);
        }
    }

    @And("User sending the keys in DialogContent_Faruk")
    public void userSendingTheKeysInDialogContent_Faruk(DataTable datas) {
        List<List<String>> items = datas.asLists(String.class);
        for (int i = 0; i <items.size() ; i++) {
            WebElement e=dc.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);
            dc.mySendKeyes(e, yazi);
        }
    }

//    @When("Click on the signin element in DialogContent_Faruk")
//    public void clickOnTheSigninElementInDialogContent_Faruk() {
//        dc.myClick(dc.signInButton);
//
//    }
//
//    @Then("Enter email as {string} and click createAnAccount button")
//    public void enterEmailAsAndClickCreateAnAccountButton(String email) {
//        dc.mySendKeyes(dc.emailCreateInput, email);
//        dc.myClick(dc.createAccountButton);
//    }
//
//
//    @When("Create an account firstName as {string} lastName as {string} password as {string}")
//    public void createAnAccountFirstNameAsLastNameAsPasswordAs(String firstName, String lastName, String password) {
//        dc.mySendKeyes(dc.firstNameInput, firstName);
//        dc.mySendKeyes(dc.lastNameInput, lastName);
//        dc.mySendKeyes(dc.passwordInput, password);
//        dc.myClick(dc.registerButton);
//    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.successText, "created");
    }



}
