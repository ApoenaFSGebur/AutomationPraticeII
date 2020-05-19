package pages;

import hooks.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shipping extends BaseTest {

    @FindBy(css="#cgv")
    private WebElement chkTermsOfService;

    @FindBy(css="button[name='processCarrier']")
    private WebElement btnProceedToCheckOut;

    public void confirmShipping () {
        chkTermsOfService.click();
        btnProceedToCheckOut.click();
    }

}