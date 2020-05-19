package pages;

import hooks.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product extends BaseTest {

    @FindBy (css="#add_to_cart")
    private WebElement btnAddToCart;

    @FindBy (css="#layer_cart a")
    private WebElement btnProceedToCheckOut;

    public void confirmProduct () {
        btnAddToCart.click();
        btnProceedToCheckOut.click();
    }

}
