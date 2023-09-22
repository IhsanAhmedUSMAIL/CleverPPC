package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
        // Sevgili pageFactory sen bu sayfanın sahibisin,
        // senden ricam aşağıdaki locatorları ben kullanacağım zaman
        // driver üzerinden bulup başlatıp bana hazır et.
        // Ben artık Find Element ile uğraşmak istemiyorum.

    }

    @FindBy(css="input[formcontrolname='username']")
        public WebElement username;



    public WebElement getWebElement(String strElement) {
        switch (strElement){
            case  "nameInput": return this.username;


        }
        return null;
    }

 public void deleteItem(String searchText) {

    // mySendKeyes(searchInput, searchText);
    // myClick(searchButton); // fuse bar ı çocukları ortaya çıkıyor

     //beklet
     //1. StaleElemetn hatası verdi : erken buldum tez kaybettim
     //dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
     //wait.until(ExpectedConditions.stalenessOf(dc.deleteImageBtn)); //olabilir ama herzaman çözmez

     //2.yöntem sayfanın kendi waitini , loding ini yakalayalım. (en sağlam yöntem)
     //fuse-progress-bar/*    -> fuse-progress-bar ın çocukları
     // bu çocukların 0 olana bekle
     wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

    //myClick(deleteImageBtn);
    //myClick(deleteDialogBtn);

     // silme ıslemı dıalogların ortak noktası olması sebebıyle buraya aldık.
     // Silme islemi yapacagımız her seferınde tekrar tekrar kod yazmayalım dırekt cagıralım dıye aldık.

 }


}
