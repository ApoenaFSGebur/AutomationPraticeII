package pages;

import hooks.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class Address extends BaseTest {

    @FindBy (css="#address_delivery > li.address_address1.address_address2")
    private WebElement txtDeliveryAddress;

    @FindBy (css="button[name='processAddress']")
    private WebElement btnProceedToCheckOut;

    public boolean validateAddress (String valAddress) {
        String txtAddress = txtDeliveryAddress.getText();
        assertEquals(valAddress, txtAddress);
        return true;
    }

    public void confirmAddress () {
        btnProceedToCheckOut.click();
    }

}