package Pages;

import Utilities.GWD;
import Utilities.GWD_Ihs;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class US_08_Ihs_Parent {
    US_08_Ihs_contactUsInfo cu = new US_08_Ihs_contactUsInfo();
    protected WebDriverWait wait;

    public US_08_Ihs_Parent() {
        this.wait = new WebDriverWait(GWD_Ihs.getDriver(), Duration.ofSeconds(20));
    }

    protected void slowDown(int sn) {
        try {
            Thread.sleep(sn*1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    protected void myClick(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.click();
        slowDown(3);

    }

    protected void mySendKeys(WebElement element, String yazi) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(yazi);
        slowDown(3);
    }

    protected void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD_Ihs.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    protected void verifyContainsText(WebElement element, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        //action la ESC ye basarak açık kutucuk veya mesaj var ise kapat
        new Actions(GWD_Ihs.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        slowDown(3);
    }

    protected void attachFileUsingRobot(String filePath) {
        try {

        Robot robot = new Robot();

        
            StringSelection fileSelection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileSelection, null);

            robot.keyPress(KeyEvent.VK_CONTROL); // Bu iki tuş şu anda basılmış vaziyette, hafızadaki yapıştırıldı
            robot.keyPress(KeyEvent.VK_V);

            slowDown(5);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL); // tuşlar serbest bırakıldı

            slowDown(5);
            robot.keyPress(KeyEvent.VK_ENTER); // Dosya Entera basılarak gönderildi
            robot.keyRelease(KeyEvent.VK_ENTER);

            slowDown(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
