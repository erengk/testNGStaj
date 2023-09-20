package Gun06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_AssertTypes {
    @Test
    void hardAssert(){
        String s1 = "Selamlar";

        System.out.println("Test Öncesi");
        Assert.assertEquals("Merhaba",s1,"Eşit Değil");
        System.out.println("Test Sonrası");
    }
    @Test
    void softAssert(){
        String s1 = "Merhaba";
        String s2 = "Selamlar";
        String s3 = "Hello";

        SoftAssert _softAssert = new SoftAssert();

        _softAssert.assertEquals(s1,s2);
        System.out.println("soft assert 1");

        _softAssert.assertEquals(s2,s3);
        System.out.println("soft assert 2");

        _softAssert.assertEquals(s1,s3);
        System.out.println("soft assert 3");


        _softAssert.assertNotEquals(s1,s3);
        System.out.println("soft assert 4");

        _softAssert.assertAll();
    }
}
