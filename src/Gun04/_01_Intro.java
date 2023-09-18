package Gun04;

import org.testng.annotations.*;

public class _01_Intro {
    @BeforeSuite
    void bSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    void bTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    void bClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    void bMethod() {
        System.out.println("Before Method");
    }
    @Test
    void Test1(){
        System.out.println("Intro Test 1");
    }
    @Test
    void Test2(){
        System.out.println("Intro Test 2");
    }

    @BeforeGroups
    void bGroups() {
        System.out.println("Before Groups");
    }

    @AfterSuite
    void aSuite() {
        System.out.println("After Suite");
    }

    @AfterTest
    void aTest() {
        System.out.println("After Test");
    }

    @AfterClass
    void aClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    void aMethod() {
        System.out.println("After Method");
    }

    @AfterGroups
    void aGroups() {
        System.out.println("After Groups");
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