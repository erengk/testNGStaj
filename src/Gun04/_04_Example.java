package Gun04;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _04_Example extends BaseDriver {
    @Test
    @Parameters("Aranacak")
    void Test1(String gelenMesaj){
        WebElement searchBox = driver.findElement(By.id("searchData"));
        searchBox.sendKeys(gelenMesaj);

        WebElement iconSearch = driver.findElement(By.className("iconsSearch"));
        iconSearch.click();

        WebElement message = driver.findElement(By.cssSelector("div.resultText  > h1"));

        wait.until(ExpectedConditions.visibilityOf(message));

        Assert.assertTrue(message.getText().contains(gelenMesaj));
    }
}
/*
1-Siteye git
2- Giriş yap
3- Searchbox içerisine "Macbook" kelimesini gönder
4- Sonuç ekranında gelen mesaj ile gönderdiğini karşılaştır ve doğrula
 */
//TODO: coockies ve pop-up mesajları otomatik olarak kapatan iyileştirmeyi yapınız.
