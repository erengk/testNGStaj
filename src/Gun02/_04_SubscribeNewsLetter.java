package Gun02;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_SubscribeNewsLetter extends BaseDriver {

    By newsletterLink = By.xpath("(//a[text()='Newsletter'])[1]");
    By subscribeYes = By.xpath("(//input[@type='radio'])[1]");
    By subscribeNo = By.xpath("(//input[@type='radio'])[2]");
    By continueButton = By.xpath("//input[@value='Continue']");

    @Test
    void subscribeFunctionYes(){
        WebElement link = driver.findElement(By.xpath("(//a[text()='Newsletter'])[1]"));
        link.click();

        WebElement subYes = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        subYes.click();

        WebElement continueBtn = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueBtn.click();

        WebElement message = driver.findElement(By.xpath("//div[text()=' Success: Your newsletter subscription has been successfully updated!']"));

        Assert.assertTrue(message.getText().toLowerCase().contains("success"),"Başarısız!");
    }

    @Test
    void subscribeFuntionNo(){
        WebElement link = driver.findElement(By.xpath("(//a[text()='Newsletter'])[1]"));
        link.click();

        WebElement subNo = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        subNo.click();

        WebElement continueBtn = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueBtn.click();

        WebElement message = driver.findElement(By.xpath("//div[text()=' Success: Your newsletter subscription has been successfully updated!']"));

        Assert.assertTrue(message.getText().toLowerCase().contains("success"),"Başarısız!");
    }
    @Test
    void subscribeChange(){
        WebElement link = driver.findElement(By.xpath("(//a[text()='Newsletter'])[1]"));
        link.click();
        WebElement subYes = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement subNo = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));

        if (subYes.isSelected())
            subNo.click();
        else
            subYes.click();

        WebElement continueBtn = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueBtn.click();

        WebElement message = driver.findElement(By.xpath("//div[text()=' Success: Your newsletter subscription has been successfully updated!']"));

        Assert.assertTrue(message.getText().toLowerCase().contains("success"),"Başarısız!");
    }

    @Test
    void Test(){
        WebElement newsletter = driver.findElement(newsletterLink);
        newsletter.click();

        WebElement subYes = driver.findElement(subscribeYes);

        WebElement subNo = driver.findElement(subscribeNo);

        if (subYes.isSelected())
            subNo.click();
        else
            subYes.click();

        WebElement button = driver.findElement(continueButton);
        button.click();

        Tools.successMessageValidation();
    }
}
/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone olunuz(YES)
  3- Ayrı bir test ile newsletter abonelikten çıkınız (NO)
  4- Ayrı bir test ile Newsletter Suscribe durumunu kontrol ediniz. YES ise No, No ise YES yapınız
 */