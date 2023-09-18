package Gun04;

import org.testng.annotations.Test;

public class _03_Groups {
    @Test(groups = {"Smoke Test"})
    void Test1(){
        System.out.println("test 1");
    }
    @Test(groups = {"Regression Test"})
    void Test3(){
        System.out.println("test 3");
    }
    @Test(groups = {"Smoke Test"})
    void Test4(){
        System.out.println("test 4");
    }
    @Test(groups = {"Regression Test"})
    void Test2(){
        System.out.println("test 2");
    }
    @Test
    void Test7(){
        System.out.println("test 7");
    }
    @Test(groups = {"Smoke Test"})
    void Test6(){
        System.out.println("test 6");
    }
    @Test(groups = {"Regression Test"})
    void Test5(){
        System.out.println("test 5");
    }
}
