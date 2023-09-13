package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Tools {
    public static void WaitFunction(int s){

        try{
            Thread.sleep(1000*s);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public static void successMessageValidation(){
        WebElement message = BaseDriver.driver.findElement(By.xpath("//div[text()=' Success: Your newsletter subscription has been successfully updated!']"));
        Assert.assertTrue(message.getText().toLowerCase().contains("success"),"Başarısız!");
    }
}
