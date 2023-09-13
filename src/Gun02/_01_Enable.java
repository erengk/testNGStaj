package Gun02;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _01_Enable {
    public static WebDriver driver;
    public static WebDriverWait wait;
    @Test
    void Test1(){
        System.out.println("test1");
    }
    @Test
    void Test2(){
        System.out.println("test2");
    }
    @Test
    void Test3(){
        System.out.println("test3");
    }

    @BeforeClass
    void baslangic(){
        KalanOncekileriKapat();

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);

        driver.manage().timeouts().implicitlyWait(dr);
    }
    @AfterClass
    public void bitisIslemleri(){
        MyFunctions.Bekle(3);
        driver.quit();
    }

    public static void KalanOncekileriKapat() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignore) {

        }
    }
}
/*
@BeforeClass
@AfterClass
@BeforeMethod
@AfterMethod
@Test(priority = 1)
 */