package Gun05;

import Utility.BaseDriverWithParameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
      Senaryo ;
      1- Siteyi açınız.
      2- mac kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
      4- aynı işlemi samsung için de yapınız
    */
public class _01_SearchFunctionality extends BaseDriverWithParameters {
    @Test
    @Parameters("Aranacak")
    void Test1(String gelenMesaj){

        WebElement searchBox = driver.findElement(By.id("searchData"));
        searchBox.sendKeys(gelenMesaj);

        WebElement iconSearch = driver.findElement(By.className("iconsSearch"));
        iconSearch.click();

        WebElement message = driver.findElement(By.cssSelector("div.resultText  > h1"));

        Assert.assertTrue(message.getText().contains(gelenMesaj));
    }
}
