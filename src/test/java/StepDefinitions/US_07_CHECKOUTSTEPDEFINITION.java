package StepDefinitions;

import Pages.VildanContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class US_07_CHECKOUTSTEPDEFINITION {

    VildanContent vc=new VildanContent();
    @Given("Navigate to CleverPpc")
    public void navigateToCleverPpc() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");

    }

    @And("Click sign in button")
    public void clickSignInButton() {
        vc.myClick(vc.signIn);
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        vc.mySendKeyes(vc.eMail,"testtec@gmail.com");
        vc.mySendKeyes(vc.pass,"123456");
        vc.myClick(vc.loginButton);


    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

        vc.verifyContainsText(vc.welcomeMessage,"Welcome");
    }

    @And("the user can click on the shopping cart icon \\(Cart)")
    public void theUserCanClickOnTheShoppingCartIconCart() {
        vc.myClick(vc.dresses);
        vc.scrollToElement(vc.scroll);
        Actions act=new Actions(GWD.getDriver());
        act.moveToElement(vc.dress).build().perform();
        vc.myClick(vc.addToCart);
        vc.myClick(vc.closeWindow);
        vc.myClick(vc.cart);
    }

    @When("the user clicks on the Checkout button")
    public void theUserClicksOnTheCheckoutButton() {
        vc.myClick(vc.proceedBtn);
    }


    @Then("Selected address  should be displayed")
    public void selectedAddressShouldBeDisplayed() {
       vc.scrollToElement(vc.address);
        vc.verifyContainsText(vc.address,"YOUR");


        vc.myClick(vc.proceedBtn);



    }

    @And("the Shipment method is selected by default")
    public void theShipmentMethodIsSelectedByDefault(){

        vc.verifyContainsText(vc.adressSelected,"Choose a shipping option for this address: My address");

    }

    @And("the Terms and Conditions Agreement is accepted by clicking I Agree...")
    public void theTermsAndConditionsAgreementIsAcceptedByClickingIAgree() {
        vc.scrollToElement(vc.scroll2);
        vc.myClick(vc.checkBox);

    }

    @And("the user can click on the Proceed to checkout button")
    public void theUserCanClickOnTheProceedToCheckoutButton() {
        vc.myClick(vc.proceedBtn1);

    }

    @And("the user clicks on the Pay with PayPal button")
    public void theUserClicksOnThePayWithPayPalButton() {

        vc.myClick(vc.payPal);

    }
    @Then("the negative message should be displayed")
    public void theNegativeMessageShouldBeDisplayed() {
        vc.verifyContainsText(vc.payPalNagetiveMessage,"Şu anda bir şeylerin");

    }

    @And("the user navigates back")
    public void theUserNavigatesBack() {


        GWD.getDriver().navigate().back();
    }



    @And("the user clicks on the Pay with Credit Card button")
    public void theUserClicksOnThePayWithCreditCardButton() {

        vc.myClick(vc.creditCard);

    }

    @Then("the credit card negative message should be displayed")
    public void theCreditCardNegativeMessageShouldBeDisplayed() {
        vc.verifyContainsText(vc.creditCardNegativeMessage,"Invalid request (1).");

    }

    @And("the user can click on the Pay with Bank Transfer button")
    public void theUserCanClickOnThePayWithBankTransferButton() {

        vc.myClick(vc.bankWire);


    }

    @Then("it should be verified that the total amount shown in the message matches the sum of the product cost including tax and shipping cost")
    public void itShouldBeVerifiedThatTheTotalAmountShownInTheMessageMatchesTheSumOfTheProductCostIncludingTaxAndShippingCost() {


        String totalPriceText = vc.totalPrice.getText();
        totalPriceText = totalPriceText.replaceAll("[^0-9]", "");

        int total = Integer.parseInt(totalPriceText);
        System.out.println("total = " + total);

        String lastTotalText=vc.lastTotal.getText();
        lastTotalText=lastTotalText.replaceAll("[^0-9]", "");

        int lasTotal=Integer.parseInt(lastTotalText);
        System.out.println("lasTotal = " + lasTotal);

        Assert.assertEquals(total,lasTotal,"Tutarlar birbirine esit degil");


    }

    @And("the user can click on the I confirm my order button")
    public void theUserCanClickOnTheIConfirmMyOrderButton() {
        vc.myClick(vc.confirm);


    }



    @And("it should be displayed that the message indicates the payment has been processed")
    public void itShouldBeDisplayedThatTheMessageIndicatesThePaymentHasBeenProcessed() {

        vc.verifyContainsText(vc.confirmMessage,"Your order on Xu Clothing is complete.");

    }


    @And("the order number from the displayed message should be verified")
    public void theOrderNumberFromTheDisplayedMessageShouldBeVerified() {


        System.out.println("vc.orderNumber.getText() = " + vc.orderNumber.getText());
        vc.verifyContainsText(vc.orderNumber,"order");

    }



}
