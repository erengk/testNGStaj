package Gun03;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/*
       Senaryo;
       1- Siteyi açınız. https://www.n11.com/
       2- 3 adet Adress Ekleyiniz.
       3- En son adresi edit yaparak şehir ve ilçe bilgisini değiştirip kaydediniz.
       4- Eklediğiniz adresleri siliniz.
       5- Test method'larınızı depends ile sıralayın.
 */
public class _02_AddressFunctionality extends BaseDriver {

    @Test
    void addAddress(){
        WebElement linkText = driver.findElement(By.xpath("//span[text()='Eskişehir/Tepebaşı']"));
        linkText.click();

        WebElement addressSelect = driver.findElement(By.id("headerMyLocationCityId"));
        Select address = new Select(addressSelect);
        address.selectByVisibleText("Ankara");


        WebElement webZone = driver.findElement(By.id("headerMyLocationDistrictId"));
        Select zone = new Select(webZone);
        zone.selectByValue("22717");
        //zone.selectByIndex(4); //Hata veriyor
        //selectByVisibleText ve selectByValue bekleme fonksiyonu olarak implicitlyWait kullanırlar
        //selectByIndex ise ExplicitWait

        WebElement konumButton = driver.findElement(By.id("headerSetMyLocationBtn"));
        konumButton.click();

    }
    @Test
    void editAddress(){

    }

    @Test
    void deleteAddress(){

    }
}
    /*
     @BeforeSuite
       @BeforeTest
         @BeforeGroups ->smoke test, regression test
           @BeforeClass
             @BeforeMethod
                 @Test1 method
                 @Test2 method
             @AfterMethod
           @AfterClass
         @AfterGroups
       @AfterTest
     @AfterSuite
   */