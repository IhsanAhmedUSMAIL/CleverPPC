package StepDefinitions;
import Pages.DialogContent_Cansu;
import Pages.TopNav;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US_06_Cansu {
    TopNav ln = new TopNav();
    DialogContent_Cansu dc = new DialogContent_Cansu();

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
        Assert.assertTrue(dc.cartContains.getText().contains("3"),"seçilen ürün 3 adetten farklıdır.");
    }
}