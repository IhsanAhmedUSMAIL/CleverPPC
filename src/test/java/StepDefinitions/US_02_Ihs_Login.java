package StepDefinitions;

import Pages.US_02_LoginContent_Ihs;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class US_02_Ihs_Login {

    US_02_LoginContent_Ihs lc=new US_02_LoginContent_Ihs();

    @Given("Navigate to cleverPPC")
    public void navigateToCleverPPC() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("Click sign-in button and enter {string} and {string} and click sign-in button")
    public void enterUsernameAndPasswordAndClickLoginButton(String email, String password) {

       lc.myClick(lc.signIn1);
        lc.mySendKeys(lc.email,email);
        lc.mySendKeys(lc.password, password);
        lc.myClick(lc.signIn2);

    }

    @Then("User should not be able to login")
    public void userShouldNotBeAbleToLogin() {
        lc.verifyContainsText(lc.hata, "Authentication failed.");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        lc.verifyContainsText(lc.welcomeMessage, "Welcome to your account");

    }

    @When("Click sign-in button and enter valid email and password and click sign-in button")
    public void clickSignInButtonAndEnterValidEmailAndPasswordAndClickSignInButton() {

        lc.myClick(lc.signIn1);
        lc.mySendKeys(lc.email, "t.ten.techno@gmail.com");
        lc.mySendKeys(lc.password, "TTtechno10");
        lc.myClick(lc.signIn2);

    }
}
