package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/
public class _02_PlaceOrder extends BaseDriver {
    @Test
    void Test(){
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys("ipod");

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchButton.click();

        WebElement addToCard = driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]"));
        addToCard.click();

        WebElement shoppingCard = driver.findElement(By.id("cart-total"));
        shoppingCard.click();

        WebElement checkout = driver.findElement(By.xpath("(//i[@class='fa fa-share'])[2]"));
        checkout.click();

        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-payment-firstname")));
        firstName.sendKeys("Carlos");

        WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-payment-lastname")));
        lastName.sendKeys("Santana");

        WebElement addressLine1 = driver.findElement(By.id("input-payment-address-1"));
        addressLine1.sendKeys("Eskisehir");

        WebElement city = driver.findElement(By.id("input-payment-city"));
        city.sendKeys("Eskisehir");

        WebElement postalCode = driver.findElement(By.id("input-payment-postcode"));
        postalCode.sendKeys("12345");

        WebElement countrySelect = driver.findElement(By.id("input-payment-country"));
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Turkey");

        WebElement stateSelect = driver.findElement(By.id("input-payment-zone"));
        Select select1 = new Select(stateSelect);
        select1.selectByVisibleText("Eskişehir");

        WebElement addressButton = driver.findElement(By.id("button-payment-address"));
        wait.until(ExpectedConditions.elementToBeClickable(addressButton));
        addressButton.click();

        WebElement buttonShipping = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
        buttonShipping.click();

        WebElement buttonShippingMethod = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        buttonShippingMethod.click();

        WebElement agreeBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("agree")));
        agreeBox.click();

        WebElement paymentMethod = driver.findElement(By.id("button-payment-method"));
        paymentMethod.click();

        WebElement confirm = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-confirm")));
        confirm.click();

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#content > *:nth-child(2)")));
        Assert.assertTrue(message.getText().contains("success"));
    }

}
