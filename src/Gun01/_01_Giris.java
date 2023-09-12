package Gun01;


import org.testng.annotations.Test;

public class _01_Giris {
    /*
    public static void main(String[] args) {
        webSitesineGit();
        LoginIslemiYap();
        driveriKapat();
    }

    @Test //JUnit
    public void Test(){
        webSitesineGit();
        LoginIslemiYap();
        driveriKapat();
    }
     */

    @Test(priority = 1)
    public void webSitesiniAc(){
        System.out.println("web sitesine gidildi");
    }
    @Test(priority = 3)
    public void loginIsleminiYap(){
        System.out.println("login işlemi yapıldı");
    }
    @Test(priority = 2)
    public void driveriKapat(){
        System.out.println("driver kapatildi");
    }
}
