package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void baslangicIslemleri(){
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

        wait = new WebDriverWait(driver,Duration.ofSeconds(30));

        loginTest();
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

    void loginTest(){

//        driver.get("https://www.n11.com/");
//        WebElement loginPage = driver.findElement(By.linkText("Giriş Yap"));
//        loginPage.click();
//        WebElement eMail = driver.findElement(By.id("email"));
//        eMail.sendKeys("gkhnrnkmr@gmail.com");
//        WebElement password = driver.findElement(By.id("password"));
//        password.sendKeys("test12345*/");
//        WebElement loginBtn = driver.findElement(By.id("loginButton"));
//        List<WebElement> alerts = driver.findElements(By.xpath(""));
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click();",loginBtn);
//        loginBtn.click();

        //WebElement linkText = driver.findElement(By.xpath("//span[text()='Eskişehir/Tepebaşı']"));

        //Assert.assertTrue(linkText.isDisplayed(),"Giriş Başarısız");


        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement emailAddress = driver.findElement(By.id("input-email"));
        emailAddress.sendKeys("carlosSantana@gmail.com");
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("1234");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();

        WebElement assertElement = driver.findElement(By.xpath("(//a[text()='Edit Account'])[1]"));
        Assert.assertTrue(assertElement.isDisplayed(),"Giriş Başarısız");
    }
}
/*
https://opencart.abstracta.us/index.php?route=account/login
carlosSantana@gmail.com
1234
 */