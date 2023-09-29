package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;


public class US_02_Login_Ihs {

    DialogContent lc=new DialogContent();

   @Given("Navigate to CleverPPC")
   public void navigateToCleverPPC() {
       GWD.getDriver().get("https://cleverppc.com/prestashop4/");
   }

    @When("Click sign-in button and enter {string} and {string} and click sign-in button")
    public void enterUsernameAndPasswordAndClickLoginButton(String email, String password) {

       lc.myClick(lc.signIn1);
        lc.mySendKeyes(lc.emailIhs,email);
        lc.mySendKeyes(lc.password, password);
        lc.myClick(lc.signIn2);

    }

    @Then("User should not be able to login")
    public void userShouldNotBeAbleToLogin() {
        lc.verifyContainsText(lc.hata, "Authentication failed.");
    }


    @When("Click sign-in button and enter valid email and password and click sign-in button")
    public void clickSignInButtonAndEnterValidEmailAndPasswordAndClickSignInButton() {

        lc.myClick(lc.signIn1);
        lc.mySendKeyes(lc.emailIhs, "cekk7@gmail.com");
        lc.mySendKeyes(lc.password, "far123");
        lc.myClick(lc.signIn2);

    }

    @Then("User should be able to login successfully")
    public void userShouldBeAbleToLoginSuccessfully() {
        lc.verifyContainsText(lc.welcomeMessage, "Welcome to your account");

    }
}
