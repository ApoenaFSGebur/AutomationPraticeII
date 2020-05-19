package pages;

import hooks.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummary extends BaseTest {

    @FindBy(css="#columns button[type='submit']")
    private WebElement btnIConfirmMyOrder;

    public void confirmOrder () {
        btnIConfirmMyOrder.click();
    }

}
