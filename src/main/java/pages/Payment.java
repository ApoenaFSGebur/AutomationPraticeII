package pages;

import hooks.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class Payment extends BaseTest {

    @FindBy(css="#total_price")
    private WebElement txtTotalPrice;

    @FindBy(css=".cheque")
    private WebElement btnPayByCheck;

    public boolean validateTotalPrice (String valPrice) {
        String txtPrice = txtTotalPrice.getText();
        assertEquals(valPrice, txtPrice);
        return true;
    }
    public void selectPaymentMethod() {
        btnPayByCheck.click();
    }

}