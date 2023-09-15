package Gun02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assetions {
    @Test
    void EqualsOrnek() {
        String s1 = "Merhaba";
        String s2 = "Merhaba1";

        Assert.assertEquals(s1, s2, "Karşılaştırma sonucu eşit değil");
    }

    @Test
    void notEqualsOrnek() {
        String s1 = "Merhaba";
        String s2 = "Merhaba1";

        Assert.assertNotEquals(s1,s2,"Beklenen sonuç alınamadı");
    }

    @Test
    void trueOrnek(){
        int i1 = 66;
        int i2 = 75;

        Assert.assertTrue(i1 == i2, "Hatalı sonuç");
    }

    @Test
    void nullOrnek(){
        //String s3 = null;
        String s3 = "null";

        Assert.assertNull(s3, "Değer null değil");
    }

    @Test
    void faillOrnek(){
        int a = 55;
        if (a == 55)
            Assert.fail();

        //Assert.assertNotNull(a, "Değer verilmemiş");
    }

}
