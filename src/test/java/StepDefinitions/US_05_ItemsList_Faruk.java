package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class US_05_ItemsList_Faruk {
    DialogContent dc = new DialogContent();

    @When("Click on the dresses in DialogContent")
    public void clickOnTheDressesInDialogContent() {

        dc.myClick(dc.dressesButton);
    }

    @And("User should confirm the shown total numbers in DialogContent")
    public void userShouldConfirmTheShownTotalNumbersInDialogContent() {

        String strUstToplam = dc.topListNumber.getText().replaceAll("[^0-9]","");
        String strAltToplam = dc.downListNumber.getText().replaceAll("[^0-9]","");
        Assert.assertTrue(strAltToplam.contains(strUstToplam),"Urun toplamları hatalı gösteriliyor");
    }

    @And("User creates a list of all items in DialogContent")
    public void userCreatesAListOfAllItemsInDialogContent() {


    }

    @Then("User should confirm the list size is equal with shown total numbers DialogContent")
    public void userShouldConfirmTheListSizeIsEqualWithShownTotalNumbersDialogContent() {
        int ustToplam= Integer.parseInt(dc.topListNumber.getText().replaceAll("[^0-9]",""));
        Assert.assertEquals(dc.itemsList.size(), ustToplam, "Listelenen ürün sayısı ile üstte yazan toplam aynı değil");
    }
}
