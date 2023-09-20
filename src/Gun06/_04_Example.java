package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

/*
    Senaryo ;
    1- Siteye gidiniz..

   1.Test;
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elemanı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
   Bu Ödevi POM yapısı ile oluşturunuz.
 */
public class _04_Example extends BaseDriver {
    @Test
    void Test(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000);");

    }
}
