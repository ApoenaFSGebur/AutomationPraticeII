package pages;

import hooks.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BaseTest {

    @FindBy(css="#email_create")
    private WebElement txtEmailAddress;

    @FindBy(css="#SubmitCreate")
    private WebElement btnCreateAnAccount;

    public void createNewAccount (String email) {
        txtEmailAddress.sendKeys(email);
        btnCreateAnAccount.click();
    }
}
