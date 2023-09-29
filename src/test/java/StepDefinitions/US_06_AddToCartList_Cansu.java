package StepDefinitions;
import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;

public class US_06_AddToCartList_Cansu {
    DialogContent dc = new DialogContent();

    @When("Choose the dresses")
    public void chooseTheDresses() {
        dc.myClick(dc.dRESSESbutton);
        dc.myClick(dc.listelemeButonu);

        List<String> descriptionsSTR = new ArrayList<>();
        do {
            int randomSecim = (int) (Math.random() * dc.dressesNamesL1.size());
            WebElement secilenElbise = dc.dressesNamesL1.get(randomSecim);
            if (descriptionsSTR.contains(dc.descriptions.get(randomSecim).getText())){
                break;
            }
            else {
                descriptionsSTR.add(dc.descriptions.get(randomSecim).getText());
                dc.myClick(secilenElbise);
                dc.myClick(dc.ekleme);
                dc.myClick(dc.continueButton);
                GWD.getDriver().navigate().back();
                System.out.println(dc.descriptions.get(randomSecim).getText());
            }
        } while (descriptionsSTR.size() < 3  );
    }
    @Then("Confirm cart")
    public void confirmCart() {
              dc.myClick(dc.cartButton);
              dc.verifyContainsText(dc.cartContains,"2");
        //Assert.assertTrue(dc.cartContains.getText().contains("3"),"seçilen ürün 3 adetten farklıdır.");
    }
}