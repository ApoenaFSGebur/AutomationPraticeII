package pages;

import hooks.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Index extends BaseTest {

    private WebElement lnkProduct;

    public void accessApplication() {
        getDriver().get(URL_BASE);
    }

    public void selectProduct(String productChoosed) {
        lnkProduct = getDriver().findElement(By.cssSelector("ul[id='homefeatured'] a[class='product-name'][title='" + productChoosed + "']"));
        lnkProduct.click();
    }
}

