package pages;

import hooks.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class Confirmation extends BaseTest {

    @FindBy(css="p.alert.alert-success")
    private WebElement txtYourOrderOnMyStoreIsComplete;

    public boolean validateOrder (String valOrder) {
        String txtOrder = txtYourOrderOnMyStoreIsComplete.getText();
        assertEquals(valOrder, txtOrder);
        return true;
    }

}