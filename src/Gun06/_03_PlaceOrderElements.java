package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_PlaceOrderElements {
    public _03_PlaceOrderElements(){
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(name = "search")
    public WebElement searchBox;
    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    public WebElement searchButton;
    @FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
    public WebElement addToCard;
    @FindBy(id = "cart-total")
    public WebElement shoppingCard;
    @FindBy(xpath = "(//i[@class='fa fa-share'])[2]")
    public WebElement checkout;
    @FindBy(id = "input-payment-firstname")
    public WebElement firstName;
    @FindBy(id = "input-payment-lastname")
    public WebElement lastName;
    @FindBy(id = "input-payment-address-1")
    public WebElement addressLine1;
    @FindBy(id = "input-payment-city")
    public WebElement city;

    @FindBy(id = "input-payment-postcode")
    public WebElement postalCode;

    @FindBy(id = "input-payment-country")
    public WebElement countrySelect;
    @FindBy(id = "input-payment-zone")
    public WebElement stateSelect;
    @FindBy(id = "button-payment-address")
    public WebElement addressButton;
    @FindBy(id = "button-shipping-address")
    public WebElement buttonShipping;
    @FindBy(id = "button-shipping-method")
    public WebElement buttonShippingMethod;
    @FindBy(name = "agree")
    public WebElement agreeBox;
    @FindBy(id = "button-payment-method")
    public WebElement paymentMethod;
    @FindBy(id = "button-confirm")
    public WebElement confirm;
    @FindBy(css = "div#content > p")
    public WebElement message;
}
