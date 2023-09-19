package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider {
    @Test(dataProvider = "datalarim")
    void userList(String kullaniciAdi) {
        System.out.println(kullaniciAdi);
    }

    @DataProvider
   Object[] datalarim(){
        Object[] users = {"gokhan", "eren", "kamer"};
return users;
   }

   @Test(dataProvider = "datalarim1")
    void userNameTest1(int id){
       System.out.println(id);
   }
   @DataProvider
    Object[] datalarim1(){
        Object[] idler = {1,2,3,4};

        return idler;
   }
}
