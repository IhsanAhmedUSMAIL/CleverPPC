package StepDefinitions;

import Pages.US_08_Ihs_content;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_08_Ihs_contactUs  {

    US_08_Ihs_content cu = new US_08_Ihs_content();

    @When("The user click on the contact us button")
    public void theUserClickOnTheContactUsButton() {
        cu.myClick(cu.contactUs);


    }


    @And("select a subject heading")
    public void selectASubjectHeading() {
        cu.myClick(cu.customerService);

    }

    @And("enters their email address")
    public void entersTheirEmailAddress() {

        cu.mySendKeys(cu.email, "t.ten.techno@gmail.com");

    }

    @And("choose an order reference")
    public void chooseAnOrderReference() {
        cu.mySendKeys(cu.orderReference, "DVJLYMYBQ");

    }

    @And("write down a message")
    public void writeDownAMessage() {
        cu.mySendKeys(cu.message, "Banka havalesi henüz yapıldı, ödeme dekontu ektedir. Team Ten");

    }
    @When("choose a file from the computer")
    public void chooseAFileFromTheComputer() {
      cu.myClick(cu.attachFile);
    }
        @And("attach a payment receipt file")
        public void attachAPaymentReceiptFile() {
           cu.attachFileUsingRobot("C:\\Users\\LENOVO V15 Gen2\\Downloads\\Yedek\\Gun37\\_01_Soru\\carsInterface.jpg");
        }

    @And("Click on the Send button")
    public void clickOnTheSendButton() {
        cu.myClick(cu.send);
    }

    @Then("the user should successfully send the payment receipt to customer service")
    public void theUserShouldSuccessfullySendThePaymentReceiptToCustomerService() {

        cu.verifyContainsText(cu.onay, "Your message has been successfully sent to our team");

    }

}


