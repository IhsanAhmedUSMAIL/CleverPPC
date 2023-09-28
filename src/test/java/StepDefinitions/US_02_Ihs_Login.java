package StepDefinitions;

import Pages.US_02_LoginContent_Ihs;
import Utilities.GWD_Ihs;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class US_02_Ihs_Login {

    US_02_LoginContent_Ihs lc=new US_02_LoginContent_Ihs();

    @Given("Navigate to cleverPPC")
    public void navigateToCleverPPC() {
        GWD_Ihs.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("Click sign-in button and enter {string} and {string} and click sign-in button")
    public void enterUsernameAndPasswordAndClickLoginButton(String email, String password) {
        lc.signIn1.click();
        lc.email.sendKeys(email);
        lc.password.sendKeys(password);
        lc.signIn2.click();
    }

    @Then("User should not be able to login")
    public void userShouldNotBeAbleToLogin() {
        WebElement errorMessage = GWD_Ihs.getDriver().findElement(By.xpath("(//div[@class='alert alert-danger'])[1]"));

        Assert.assertTrue(errorMessage.getText().contains("Authentication failed."));
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        Assert.assertTrue(GWD_Ihs.getDriver().getCurrentUrl().contains("my-account"));
    }

    @When("Click sign-in button and enter valid email and password and click sign-in button")
    public void clickSignInButtonAndEnterValidEmailAndPasswordAndClickSignInButton() {

        lc.signIn1.click();
        lc.email.sendKeys("t.ten.techno@gmail.com");
        lc.password.sendKeys("TTtechno10");
        lc.signIn2.click();



    }
}
