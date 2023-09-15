package Gun03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {

    @Test
    void openPC(){
        System.out.println("bilgisayarın kapağı açıldı!");
    }

    @Test(dependsOnMethods = {"openPC"})
    void powerOn(){
        System.out.println("Güç tuşuna basıldı!");
    }

    @Test(dependsOnMethods = {"powerOn", "openPC"})
    void iconClick(){
        Assert.fail();
        System.out.println("intellij Icon'una tıklandı!");
    }

    @Test(dependsOnMethods = {"iconClick"}, alwaysRun = true)
    void codingStart(){
        System.out.println("Kodlamaya başlandı!");
    }
}
