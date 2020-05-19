package pages;

import hooks.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.*;

public class AddCart extends BaseTest {

    @FindBy(css="#order-detail-content .product-name a")
    private WebElement lnkProduct;

    @FindBy(css=".columns-container a[title='Proceed to checkout']")
    private WebElement btnProceedToCheckOut;

    public boolean validateProduct (String valProduct) {
        String txtProduct = lnkProduct.getText();
        assertEquals(valProduct, txtProduct);
        return true;
    }

    public void confirmShoppingCart () {
        btnProceedToCheckOut.click();
    }

}
