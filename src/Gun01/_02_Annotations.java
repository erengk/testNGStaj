package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {

    @Test(priority = 2)
    public void Test1(){
        System.out.println("Test 1 çalıştı");
    }
    @Test(priority = 1)
    public void Test2(){
        System.out.println("Test 2 çalıştı");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class Çalıştı");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class Çalıştı");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method Çalıştı");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method Çalıştı");
    }
    @Test(priority = 2)
    public void Test3(){
        System.out.println("Test 3 Çalıştı");
    }
}
/*
beforeClass -> driver başlat (driver tanımlanacak, hangi browser kullanılacak, vb. özellikler oluşturulacak)
beforeMethod
test1
afterMethod
beforeMethod
test3
afterMethod
afterClass -> driver kapat
 */