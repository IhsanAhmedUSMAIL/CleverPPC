package StepDefinitions;

import Pages.US_08_Ihs_Parent;
import Pages.US_08_Ihs_contactUsInfo;
import Utilities.GWD_Ihs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class US_08_Ihs_contactUs extends US_08_Ihs_Parent {

    US_08_Ihs_contactUsInfo cu = new US_08_Ihs_contactUsInfo();

    @When("The user click on the contact us button")
    public void theUserClickOnTheContactUsButton() {
        myClick(cu.contactUs);
    }

    @And("select a subject heading")
    public void selectASubjectHeading() {
        myClick(cu.customerService);
    }

    @And("enters their email address")
    public void entersTheirEmailAddress() {
        mySendKeys(cu.email, "t.ten.techno@gmail.com");
    }

    @And("choose an order reference")
    public void chooseAnOrderReference() {
        mySendKeys(cu.orderReference, "DVJLYMYBQ");
    }

    @And("write down a message")
    public void writeDownAMessage() {
        mySendKeys(cu.message, "Banka havalesi henüz yapıldı, ödeme dekontu ektedir. Team Ten");
    }
    @When("choose a file from the computer")
    public void chooseAFileFromTheComputer() {
      myClick(cu.attachFile);
    }
        @And("attach a payment receipt file")
        public void attachAPaymentReceiptFile() {
            attachFileUsingRobot("C:\\Users\\LENOVO V15 Gen2\\Downloads\\Yedek\\Gun37\\_01_Soru\\carsInterface.jpg");
        }

    @And("Click on the Send button")
    public void clickOnTheSendButton() {
        myClick(cu.send);
    }

    @Then("the user should successfully send the payment receipt to customer service")
    public void theUserShouldSuccessfullySendThePaymentReceiptToCustomerService() {
        Assert.assertTrue(GWD_Ihs.getDriver().findElement(By.xpath("//p[@class='alert alert-success']"))
                .getText().contains("Your message has been successfully sent to our team"));
    }

}


