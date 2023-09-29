package StepDefinitions;

import Pages.DialogContent_Faruk;
import Pages.TopNav_Faruk;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Arrays;

public class US_05_ItemsList_Faruk {
    DialogContent_Faruk dc = new DialogContent_Faruk();
    TopNav_Faruk tn = new TopNav_Faruk();
    @When("Click on the dresses in TopNav_Faruk")
    public void clickOnTheDressesInTopNav_Faruk() {

        tn.myClick(tn.dressesButton);
    }

    @And("User should confirm the shown total numbers in DialogContent_Faruk")
    public void userShouldConfirmTheShownTotalNumbersInDialogContent_Faruk() {

        String strUstToplam = dc.topListNumber.getText().replaceAll("[^0-9]","");
        String strAltToplam = dc.downListNumber.getText().replaceAll("[^0-9]","");
        Assert.assertTrue(strAltToplam.contains(strUstToplam),"Urun toplamları hatalı gösteriliyor");
    }

    @And("User creates a list of all items in DialogContent_Faruk")
    public void userCreatesAListOfAllItemsInDialogContent_Faruk() {


    }

    @Then("User should confirm the list size is equal with shown total numbers DialogContent_Faruk")
    public void userShouldConfirmTheListSizeIsEqualWithShownTotalNumbersDialogContent_Faruk() {
        int ustToplam= Integer.parseInt(dc.topListNumber.getText().replaceAll("[^0-9]",""));
        Assert.assertEquals(dc.itemsList.size(), ustToplam, "Listelenen ürün sayısı ile üstte yazan toplam aynı değil");
    }
}
