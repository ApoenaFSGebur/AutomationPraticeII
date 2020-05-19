import hooks.BaseTest;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.*;

import static org.junit.Assert.*;

public class PurchaseTest extends BaseTest {

    @Test
    public void test() {

        Index index = PageFactory.initElements(getDriver(), Index.class);
        Product product = PageFactory.initElements(getDriver(), Product.class);
        AddCart addCart = PageFactory.initElements(getDriver(), AddCart.class);
        Login login = PageFactory.initElements(getDriver(), Login.class);
        Register register = PageFactory.initElements(getDriver(), Register.class);
        Address address = PageFactory.initElements(getDriver(), Address.class);
        Shipping shipping = PageFactory.initElements(getDriver(), Shipping.class);
        Payment payment = PageFactory.initElements(getDriver(), Payment.class);
        OrderSummary orderSummary = PageFactory.initElements(getDriver(), OrderSummary.class);
        Confirmation confirmation = PageFactory.initElements(getDriver(), Confirmation.class);

        index.accessApplication();
        index.selectProduct("Blouse");
        product.confirmProduct();
        assertTrue(addCart.validateProduct("Blouse"));
        addCart.confirmShoppingCart();
        login.createNewAccount("atesteteste@gft.com");
        register.fillPersonalInformation("Apoena", "Gebur", "12345");
        register.fillAddress("Rua Arthur Bernardes, 00000","Cwb","California","00000","United States","98989898","Teste");
        register.confirmRegistration();
        assertTrue(address.validateAddress("Rua Arthur Bernardes, 00000"));
        address.confirmAddress();
        shipping.confirmShipping();
        assertTrue(payment.validateTotalPrice("$29.00"));
        payment.selectPaymentMethod();
        orderSummary.confirmOrder();
        assertTrue(confirmation.validateOrder("Your order on My Store is complete."));
    }

}