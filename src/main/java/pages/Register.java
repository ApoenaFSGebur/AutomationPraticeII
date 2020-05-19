package pages;

import hooks.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends BaseTest {

    @FindBy(css="#id_gender1")
    private WebElement rdoGenderMr;

    @FindBy(css="#customer_firstname")
    private WebElement txtFirstName;

    @FindBy(css="#customer_lastname")
    private WebElement txtLastName;

    @FindBy(css="#passwd")
    private WebElement txtPassword;

    @FindBy(css="#address1")
    private WebElement txtAddress;

    @FindBy(css="#city")
    private WebElement txtCity;

    @FindBy(css="#id_state")
    private WebElement txtState;

    @FindBy(css="#postcode")
    private WebElement txtPostCode;

    @FindBy(css="#id_country")
    private WebElement txtCountry;

    @FindBy(css="#phone_mobile")
    private WebElement txtPhoneMobile;

    @FindBy(css="#alias")
    private WebElement txtAlias;

    @FindBy(css="#submitAccount")
    private WebElement btnRegister;

    public void fillPersonalInformation (String firstName, String lastName, String password) {
        rdoGenderMr.click();
        txtFirstName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
        txtPassword.sendKeys(password);
    }

    public void fillAddress (String address, String city, String state, String postCode, String country, String phoneMobile, String alias) {
        txtAddress.sendKeys(address);
        txtCity.sendKeys(city);
        txtState.sendKeys(state);
        txtPostCode.sendKeys(postCode);
        txtCountry.sendKeys(country);
        txtPhoneMobile.sendKeys(phoneMobile);
        txtAlias.clear();
        txtAlias.sendKeys(alias);
    }

    public void confirmRegistration () {
        btnRegister.click();
    }
}