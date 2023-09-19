package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProvider_CokBoyutlu {
    @Test(dataProvider = "userData")
    void usernameTest(String username, String password){
        System.out.println(username + " " + password);
    }

    @DataProvider
    public Object[][] userData(){
        Object[][] data = {
                {"gokhan", "1234"},
                {"eren", "5678"},
                {"kamer", "9876"},
        };

        return data;
    }
}
